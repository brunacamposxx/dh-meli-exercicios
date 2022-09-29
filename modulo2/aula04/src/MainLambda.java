import java.util.Arrays;
import java.util.List;

public class MainLambda {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(numeros);

        numeros.forEach(n -> System.out.println(n + " - "));

        for (Integer integer:numeros) { // forEach
            System.out.println(integer);
        }
    }

}
