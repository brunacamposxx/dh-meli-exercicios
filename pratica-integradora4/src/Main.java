import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> listaDeVeiculos = new ArrayList<>();
        listaDeVeiculos.add( new Veiculo("Ford", "Fiesta", 1000));
        listaDeVeiculos.add( new Veiculo("Ford", "Focus", 1200));
        listaDeVeiculos.add( new Veiculo("Ford", "Explorer", 2500));
        listaDeVeiculos.add( new Veiculo("Fiat", "Uno", 500));
        listaDeVeiculos.add( new Veiculo("Fiat", "Cronos", 1000));
        listaDeVeiculos.add( new Veiculo("Fiat", "Torino", 1250));
        listaDeVeiculos.add( new Veiculo("Chevrolet", "Aveo", 1250));
        listaDeVeiculos.add( new Veiculo("Chevrolet", "Spin", 2500));
        listaDeVeiculos.add( new Veiculo("Toyota", "Corola", 1200));
        listaDeVeiculos.add( new Veiculo("Toyota", "Fortuner", 3000));
        listaDeVeiculos.add( new Veiculo("Renault", "Logan", 950));

        Garagem g1 = new Garagem(1, listaDeVeiculos);
//        System.out.printf(g1.toString());

//        g1.getVeiculosPorPreco();
//        g1.getVeiculosPorMarca();

    }
}
