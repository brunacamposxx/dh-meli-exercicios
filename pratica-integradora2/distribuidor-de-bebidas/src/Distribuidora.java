import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    public static void main(String[] args) {
        List<Pereciveis> pereciveis = new ArrayList<>();
        pereciveis.add(new Pereciveis(1, "banana", 5.20));
        pereciveis.add(new Pereciveis(2, "maça",15.50));
        pereciveis.add(new Pereciveis(3, "leite",40.00));

        for (int i = 0; i < 3; i++) {
            System.out.println(pereciveis.get(i).calcular(5));
        }

        List<NaoPereciveis> naoPereciveis = new ArrayList<>();
        naoPereciveis.add(new NaoPereciveis("Arroz", 4.70, "in natura"));
        naoPereciveis.add(new NaoPereciveis("Cafe", 10.0, "in natura"));
        naoPereciveis.add(new NaoPereciveis("Feijao", 5.50, "in natura"));

        for (int i = 0; i < 3; i++) {
            System.out.println(naoPereciveis.get(i).calcular(5));
        }

    }
}
