public class MainWrapper {
    public static void main(String[] args) {
        int n = 10;
        Integer integer = 15; // autoboxing, boxing conversao
        n = integer; // autoboxing, unboxing

        System.out.println(n);
        System.out.println(integer);

        int valor = Integer.parseInt("123"); // transforma o texto em numero;
        String texto = Integer.toString(123); // transforma inteiro em texto;

        Integer n1 = 200;
        Integer n2 = 200;
        System.out.println(n1 == n2); // false -> compara o objeto e nao o valor;

        System.out.println(n1.equals(n2)); // true -> compara o valor do objeto;


    }
}
