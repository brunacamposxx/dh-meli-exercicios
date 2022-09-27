package transacoes;

public interface Transacao {
    public void transacaoOk(String tipo);
    public void transacaoNaoOk(String tipo);

}
