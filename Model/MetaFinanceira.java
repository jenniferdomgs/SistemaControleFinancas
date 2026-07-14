import java.io.*;
import java.util.*;

public class MetaFinanceira implements Relatoriavel {

    private int id;
    private String objetivo;
    private double valorAlvo;
    private double valorAtual;
    private Date prazo;

    public MetaFinanceira() {
    }

    public void addFundo(double valor) throws ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException("O valor da transação deve ser maior que zero!");
        }
        this.valorAlvo = valor;
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("=== Relatório de Meta Financeira ===");
        System.out.println("Objetivo: " + objetivo);
        System.out.println("Prazo: " + prazo);
        System.out.println("Progresso: R$ " + valorAtual + " / R$ " + valorAlvo);

        if (valorAtual >= valorAlvo) {
            System.out.println("Status: Meta Alcançada! Parabéns!");
        } else {
            double falta = valorAlvo - valorAtual;
            System.out.println("Status: Em andamento. Faltam R$ " + falta);
        }
        System.out.println("------------------------------------");
    }

    // getters e setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getObjetivo() { return objetivo; }
    public void setObjetivo(String objetivo) { this.objetivo = objetivo; }

    public double getValorAlvo() { return valorAlvo; }
    public void setValorAlvo(double valorAlvo) { this.valorAlvo = valorAlvo; }

    public double getValorAtual() { return valorAtual; }
    public void setValorAtual(double valorAtual) { this.valorAtual = valorAtual; }

    public Date getPrazo() { return prazo; }
    public void setPrazo(Date prazo) { this.prazo = prazo; }
}