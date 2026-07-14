import java.io.*;
import java.util.*;

public class Transacao {

    private int id;
    private String descricao;
    private double valor;
    private Date data;
    private Categoria categoria;

    public Transacao() {
    }

    public void exibirDetalhes() {
        System.out.println("ID da Transação: " + id);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Data: " + data);
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public double getValor() { return valor; }

    public void setValor(double valor) throws ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException("O valor da transação deve ser maior que zero!");
        }
        this.valor = valor;
    }

    public Date getData() { return data; }
    public void setData(Date data) { this.data = data; }

    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
}