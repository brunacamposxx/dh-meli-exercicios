public class Main {
    public static void main(String[] args) {
       Pessoa pessoa1 = new Pessoa();
       Pessoa pessoa2 = new Pessoa("Henrique", 32, "2");
       Pessoa pessoa3 = new Pessoa("Bruna", 30, "3", 77.6f, 1.68f);

        System.out.println("Nome: " + pessoa2.getNome() + " é maior de idade? " + pessoa2.ehMaiorIdade());
        System.out.println("Nome: " + pessoa3.getNome() + " é maior de idade? " + pessoa3.ehMaiorIdade());
        System.out.println(pessoa3.calcularIMC());
    }
}
