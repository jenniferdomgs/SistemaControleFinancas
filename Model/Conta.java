import java.io.*;
import java.util.*;

public class Conta implements Relatoriavel {

    private double saldoAtual;
    private List<Transacao> transacoes;
    private List<MetaFinanceira> metas;

    public Conta() {
        this.transacoes = new ArrayList<>();
        this.metas = new ArrayList<>();
    }

    public void addTransacao(Transacao t) {
        transacoes.add(t);
    }

    public void removerTransacao(Transacao t) {
        transacoes.remove(t);
    }

    public double calcularSaldo() {

        return saldoAtual;
    }

    @Override
    public void gerarRelatorio() {

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