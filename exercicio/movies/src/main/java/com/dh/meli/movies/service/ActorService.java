package com.dh.meli.movies.service;

import com.dh.meli.movies.domain.DTO.ActorPagebleResponse;
import com.dh.meli.movies.domain.DTO.PaginatedSearchRequest;
import com.dh.meli.movies.domain.DTO.ResponseBase;
import com.dh.meli.movies.domain.entity.Actor;
import com.dh.meli.movies.repository.ActorRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActorService implements IActorService {

    private final ActorRepo repo;
    @Override
    public List<Actor> getAll() {
        return (List<Actor>) repo.findAll();
    }

    @Override
    public ResponseBase<Page<ActorPagebleResponse>> getAllPaginatedSearch(PaginatedSearchRequest searchRequest) {
        // a Pagina atual não pode ser menor que 0
        if (searchRequest.getInitialPage() < 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "O indice da página atual deve começar em 0");
        }
        // a quantidade de itens por pagina deve ser entre 1 e 50
        if (searchRequest.getPageSize() < 1 || searchRequest.getInitialPage() > 10) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Quantidade de itens por página deve ser entre 1 e 10 itens");
        }

        // cria um objeto de consulta paginada(PageRequest) a partir dos parametros informados
        PageRequest pageRequest = PageRequest.of(searchRequest.getInitialPage(), searchRequest.getPageSize());
        // pesquisa no repositorio de customer usando a consulta paginada
        Page<Actor> actorsPageble = repo.findAll(pageRequest);

        // Mapeia da entidade(Customer) para o DTO(CustomerResponse)
        Page<ActorPagebleResponse> actorsPesquisarPaginadoResponsePage = actorsPageble.map(ActorPagebleResponse::new);
        return new ResponseBase<>(actorsPesquisarPaginadoResponsePage);
    }
}
