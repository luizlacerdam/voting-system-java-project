package com.betrybe.sistemadevotacao;

import java.util.Scanner;

/**
 * Classe principal com menu.
 */
public class Principal {

  /**
   * Classe main, constructor.
   */
  public static void main(String[] args) {
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();
    Scanner scanner = new Scanner(System.in);
    Principal.cadastrarCandidato(scanner, gerenciamentoVotacao);
  }

  public static void cadastrarCandidato(Scanner scanner, GerenciamentoVotacao gerenciamentoVotacao) {
    int opcao = 0;

    while(opcao != 2) {
      System.out.println("Cadastrar pessoa candidata?\n"
          + "1 - Sim\n"
          + "2 - Não\n"
          + "Entre com o número correspondente à opção desejada:");

      String opcaoString = scanner.nextLine();
      opcao = Integer.parseInt(opcaoString);
      if (opcao == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String nomeCandidata = scanner.nextLine();
        System.out.println("Entre com o número da pessoa candidata:");
        String numeroCadidata = scanner.nextLine();
        gerenciamentoVotacao.cadastrarPessoaCandidata(nomeCandidata, Integer.parseInt(numeroCadidata));
      }
    }
  }

}
