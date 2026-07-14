import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta minhaConta = new Conta();

        Categoria catAlimentacao = new Categoria(1, "Alimentação", "Despesa");
        Categoria catSalario = new Categoria(2, "Salário", "Receita");

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n=== CONTROLE DE FINANÇAS ===");
            System.out.println("1. Adicionar Receita");
            System.out.println("2. Adicionar Despesa");
            System.out.println("3. Gerar Relatório da Conta");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            try {
                if (opcao == 1) {
                    Receita receita = new Receita();
                    receita.setId(minhaConta.getTransacoes().size() + 1);
                    receita.setData(new Date());
                    receita.setCategoria(catSalario);

                    System.out.print("Descrição da Receita: ");
                    receita.setDescricao(scanner.nextLine());
                    System.out.print("Origem (Ex: Empresa XYZ): ");
                    receita.setOrigem(scanner.nextLine());

                    System.out.print("Valor (R$): ");
                    receita.setValor(scanner.nextDouble());

                    minhaConta.addTransacao(receita);
                    System.out.println("Receita adicionada com sucesso!");

                } else if (opcao == 2) {
                    Despesa despesa = new Despesa();
                    despesa.setId(minhaConta.getTransacoes().size() + 1);
                    despesa.setData(new Date());
                    despesa.setCategoria(catAlimentacao);

                    System.out.print("Descrição da Despesa: ");
                    despesa.setDescricao(scanner.nextLine());
                    System.out.print("Forma de Pagamento: ");
                    despesa.setFormaPagamento(scanner.nextLine());
                    despesa.setStatusPagamento("Pago");

                    System.out.print("Valor (R$): ");
                    despesa.setValor(scanner.nextDouble());

                    minhaConta.addTransacao(despesa);
                    System.out.println("Despesa adicionada com sucesso!");

                } else if (opcao == 3) {
                    minhaConta.gerarRelatorio();

                    System.out.println("\n--- Extrato Detalhado ---");
                    for (Transacao t : minhaConta.getTransacoes()) {
                        t.exibirDetalhes();
                    }
                }

            } catch (ValorInvalidoException e) {
                System.out.println("ERRO DE VALIDAÇÃO: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Entrada inválida! Tente novamente.");
                scanner.nextLine(); // limpa se tiver erro na entrada
            }
        }

        System.out.println("Obrigada por usar nosso sistema. Att.: Elise e Jennifer");
        scanner.close();
    }
}