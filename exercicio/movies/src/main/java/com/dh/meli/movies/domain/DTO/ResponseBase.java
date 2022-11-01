package com.dh.meli.movies.domain.DTO;

import lombok.Getter;

@Getter
public class ResponseBase<T> {
    private boolean sucesso;

    private String mensagem;

    private T objetoRetorno;

    public ResponseBase(T objeto) {
        sucesso = true;
        mensagem = "";
        objetoRetorno = objeto;
    }

    public ResponseBase(String mensagemDeErro){
        sucesso = false;
        mensagem = mensagemDeErro;
        objetoRetorno = null;
    }
}