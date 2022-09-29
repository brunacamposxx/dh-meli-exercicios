public class Pereciveis extends Produto {
    int diasParaVencer;

    public Pereciveis(int diasParaVencer, String nome, double preco) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return "Pereciveis{" +
                "diasParaVencer=" + diasParaVencer +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public int calcular(int quantidadeDeProdutos) {
        double resultado = preco * quantidadeDeProdutos;
        System.out.println("Resultado do calculo de Perecível, preço * quantidade " + resultado);
        double precoFinal = 0;

        switch (diasParaVencer) {
            case 1 -> precoFinal = resultado / 4;
            case 2 -> precoFinal = resultado / 3;
            case 3 -> precoFinal = resultado / 2;
        }
        System.out.println("preço final, com desconto " + precoFinal);
        return (int) precoFinal;
    }
}
