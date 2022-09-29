import com.sun.jdi.connect.IllegalConnectorArgumentsException;

public class PraticaExcecoes {
    public static void main(String[] args) {
        int a = 0;
        int b = 300;
        divisao(a, b);
    }

    public static void divisao(int a, int b) {
        try {
            int retorno = b / a;
            System.out.println("A divisao de " + a + " por " + b + " é: " + retorno);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Não pode ser dividido por zero " + e.getMessage());
        } finally {
            System.out.println("Programa finalizado");
        }
    }

}
