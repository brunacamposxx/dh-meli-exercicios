public class Pessoa {
    private String nome;
    private int idade;
    private String ID;
    private double peso;
    private double altura;

    public Pessoa(){}
    public Pessoa(String nome, int idade, String ID){
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
    }
    public Pessoa(String nome, int idade, String ID, double peso, double altura){
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        double imc = peso / (altura * altura);
        System.out.println("O calculo IMC é " + imc);

        if (imc < 20) {
            System.out.println("Abaixo do peso");
            return -1;
        } if (imc > 20 && imc < 25) {
            System.out.println("Peso saudável");
            return 0;
        } else {
            System.out.println("Sobrepeso");
            return 1;
        }

    }

    public boolean ehMaiorIdade() {
        boolean maior = idade >= 18;
        return maior;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getID() {
        return ID;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
