import java.io.*;
import java.util.*;

public class Conta implements Relatoriavel {

    private double saldoAtual;
    private List<Transacao> transacoes;
    private List<MetaFinanceira> metas;

    public Conta() {
        this.transacoes = new ArrayList<>();
        this.metas = new ArrayList<>();
        this.saldoAtual = 0.0;
    }

    // atualiza o saldo automaticamente ao adicionar/remover

    public void addTransacao(Transacao t) {
        transacoes.add(t);
        calcularSaldo();
    }

    public void removerTransacao(Transacao t) {
        transacoes.remove(t);
        calcularSaldo();
    }

    public double calcularSaldo() {
        double novoSaldo = 0.0;
        for (Transacao t : transacoes) {
            // verifica se a transação é despesa ou receita
            if (t instanceof Receita) {
                novoSaldo += t.getValor();
            } else if (t instanceof Despesa) {
                novoSaldo -= t.getValor();
            } else {
                novoSaldo += t.getValor();
            }
        }
        this.saldoAtual = novoSaldo;
        return this.saldoAtual;
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("=== Relatório da sua conta ===");
        System.out.println("Saldo Atual: R$ " + saldoAtual);
        System.out.println("Total de Transações: " + transacoes.size());
        System.out.println("Total de Metas: " + metas.size());
        System.out.println("--------------------------");
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public List<MetaFinanceira> getMetas() {
        return metas;
    }
}