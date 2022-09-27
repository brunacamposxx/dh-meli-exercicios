import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 22, 13, 4, 51, 6, 37, 28, 9, 10);
        Stream<Integer> stream = numeros.stream();

        System.out.println("Exibindo todos os dados: ");
//        stream.forEach(System.out::println); // mesmo que n -> sout

        System.out.println("Numeros pares:");
        List<Integer> listaDePares = stream.filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(listaDePares);

        System.out.println("Numeros ordenados");
        numeros.stream().sorted().forEach(n -> System.out.println(n));
    }
}
