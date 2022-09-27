import entity.Basicos;

public class Main {
    public static void main(String[] args) {
        System.out.println("Basicos");
        Basicos basico = new Basicos();
        basico.consultarSaldo();
        basico.transacaoOk("Saldo");
        basico.saque(50.0);
        basico.transacaoNaoOk("Saque");
        basico.pagamentoServico("Telefone");
        basico.transacaoOk("Pagamento de telefone ");
    }
}
