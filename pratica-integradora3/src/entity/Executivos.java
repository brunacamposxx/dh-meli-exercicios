package entity;

import transacoes.Deposito;
import transacoes.Transferencia;

public class Executivos implements Deposito, Transferencia {
    @Override
    public void fazerDeposito(Double valor) {
        System.out.print("Transferencia realizada! ");
    }

    @Override
    public void fazerTED(Double valor) {
        System.out.println("Deposito realizado! ");
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
