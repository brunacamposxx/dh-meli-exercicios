public class NaoPereciveis extends Produto {
    String tipo;

    public NaoPereciveis(String nome, double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }
    @Override
    public int calcular(int quantidadeDeProdutos) {
        return super.calcular(quantidadeDeProdutos);
    }

    @Override
    public String toString() {
        return "NaoPereciveis{" +
                "tipo='" + tipo + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

}
