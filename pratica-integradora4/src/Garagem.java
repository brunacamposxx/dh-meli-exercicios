import java.util.ArrayList;
import java.util.List;

public class Garagem {
    private Integer id;
    private List<Veiculo> listaDeVeiculos;

    public Garagem(Integer id, List<Veiculo> listaDeVeiculos) {
        this.id = id;
        this.listaDeVeiculos = listaDeVeiculos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Veiculo> getListaDeVeiculos() {
        return listaDeVeiculos;
    }

    public void setListaDeVeiculos(List<Veiculo> listaDeVeiculos) {
        this.listaDeVeiculos = listaDeVeiculos;
    }

    @Override
    public String toString() {
        return "Garagem{" +
                "id=" + id +
                ", listaDeVeiculos=" + listaDeVeiculos +
                '}';
    }

    // menor para maior
    public void getVeiculosPorPreco() {
        listaDeVeiculos.stream()
                .sorted((v1, v2) -> v1.getPreco().compareTo(v2.getPreco()))
                .forEach(System.out::println);
    }

    public void getVeiculosPorMarca() {
        listaDeVeiculos.stream()
                .sorted((v1, v2) -> v1.getMarca().compareTo(v2.getMarca()))
                .forEach(System.out::println);
    }

    public void getVeiculosPorPrecoMedio() {
        listaDeVeiculos.stream()
                .sorted((v1, v2) -> v1.getPreco().compareTo(v2.getPreco()))
                .forEach(System.out::println);
    }

}
