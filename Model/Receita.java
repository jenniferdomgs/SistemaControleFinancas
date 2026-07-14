import java.io.*;
import java.util.*;

public class Receita extends Transacao {

    private String origem;

    public Receita() {
        super();
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Origem: " + origem);
        System.out.println("Tipo: Receita (+)");
        System.out.println("--------------------------");
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
}