# Sistema de Controle Financeiro — Projeto Final de POO

Este sistema foi criado como trabalho final da disciplina de Programação Orientada a Objetos, que foi ministrada pelo professor Leonardo Lucena.

O objetivo principal deste projeto é colocar em prática os conceitos de herança, polimorfismo, encapsulamento, interfaces, records e tratamento de exceções em Java de uma forma simples e direta. Isso foi feito criando um sistema para gerenciar finanças pessoais de maneira prática e fácil de usar.

---

## Desenvolvedoras

* Iara Elise

* Jennifer Domingos

---

## Funcionalidades Principais

1. **Gestão de Transações:** Cadastro e controle de Receitas e Despesas.

2. **Categorização Inteligente:** Uso de Records para a classificação imutável de transações por tipo.

3. **Metas Financeiras:** Criação de metas com valores-alvo, prazos e controle de progresso.

4. **Geração de Relatórios:** Implementação de relatórios customizados para contas e metas através de uma interface comum.

5. **Robustez e Validação:** Lançamento de exceções customizadas para impedir entradas inválidas.

---

## Estrutura do Projeto (Modelo UML)

* **Main:** Ponto de entrada do sistema contendo o menu e fluxo de execução.

* **Relatoriavel:** Define o contrato para qualquer classe capaz de emitir relatórios.

* **Conta:** Centraliza o saldo do usuário, suas transações e suas metas financeiras.

* **MetaFinanceira:** Permite o planejamento de economia para objetivos de médio/longo prazo.

* **Categoria:** Representação imutável de categorias.

* **Transacao:** Classe base que unifica os atributos comuns entre receitas e despesas.

* **Receita:** Especialização de transação que representa entradas de capital.

* **Despesa:** Especialização de transação que representa saídas de capital.

* **ValorInvalidoException:** Estende a classe Exception para capturar e tratar entradas inconsistentes do usuário.
