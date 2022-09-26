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
                '}';
    }

    @Override
    public int calcular(int quantidadeDeProdutos) {
        int resultado = (int) (preco * quantidadeDeProdutos) - diasParaVencer;
        System.out.println(resultado);
        int precoFinal = 0;

        switch (diasParaVencer) {
            case 1 -> precoFinal = resultado / 4;
            case 2 -> precoFinal = resultado / 3;
            case 3 -> precoFinal = resultado / 2;
        }
        System.out.println(precoFinal);
        return precoFinal;
    }
}
