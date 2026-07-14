import java.io.*;
import java.util.*;

public class Despesa extends Transacao {

    private String formaPagamento;
    private String statusPagamento;

    public Despesa() {
        super();
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Forma de Pagamento: " + formaPagamento);
        System.out.println("Status do Pagamento: " + statusPagamento);
        System.out.println("Tipo: Despesa (-)");
        System.out.println("--------------------------");
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }
}