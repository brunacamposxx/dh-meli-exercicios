package entity;

import transacoes.Pagamento;
import transacoes.Saldo;
import transacoes.Saque;

public class Basicos implements Saldo, Pagamento, Saque {
    @Override
    public void pagamentoServico(String tipo) {
        System.out.printf("Serviço pago: " + tipo);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo é: ... básico");
    }

    @Override
    public void saque(Double valor) {
        System.out.println("Seu saldo é: " + valor);
    }

    @Override
    public void transacaoOk(String tipo) {
    System.out.println(tipo + " realizada");
    }

    @Override
    public void transacaoNaoOk(String tipo) {
        System.out.printf(tipo + " NÃO realizada");

    }
}
