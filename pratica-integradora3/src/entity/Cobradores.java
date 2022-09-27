package entity;

import transacoes.Saldo;
import transacoes.Saque;

public class Cobradores implements Saque, Saldo {
    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo é: ...");
    }

    @Override
    public void saque(Double valor) {
        System.out.println("Saque realizado! " + valor);
    }

    @Override
    public void transacaoOk(String tipo) {
        System.out.println(tipo + "transação realizada!");
    }

    @Override
    public void transacaoNaoOk(String tipo) {
        System.out.println(tipo + "NÃO realizada!");
    }
}
