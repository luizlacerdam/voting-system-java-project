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
    Principal.cadastrarEleitor(scanner, gerenciamentoVotacao);
    Principal.menuVotacao(scanner, gerenciamentoVotacao);
  }

  /**
   * Classe responsável por cadastrar uma pessoa Candidata ja com menu.
   */
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

  /**
   * Classe responsável por cadastrar uma pessoa Eleitora ja com menu.
   */
  public static void cadastrarEleitor(Scanner scanner, GerenciamentoVotacao gerenciamentoVotacao) {
    int opcao = 0;

    while(opcao != 2) {
      System.out.println("Cadastrar pessoa eleitora?\n"
          + "1 - Sim\n"
          + "2 - Não\n"
          + "Entre com o número correspondente à opção desejada:");

      String opcaoString = scanner.nextLine();
      opcao = Integer.parseInt(opcaoString);

      if (opcao == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String nomeEleitor = scanner.nextLine();
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = scanner.nextLine();
        gerenciamentoVotacao.cadastrarPessoaEleitora(nomeEleitor, cpf);
      }
    }
  }

  /**
   * Menu de votação.
   */
  public static void menuVotacao(Scanner scanner, GerenciamentoVotacao gerenciamentoVotacao) {
    int opcao = 0;

    while(opcao != 3) {
      System.out.println(" Entre com o número correspondente à opção desejada:\n"
          + " 1 - Votar\n"
          + " 2 - Resultado Parcial\n"
          + " 3 - Finalizar Votação");

      String opcaoString = scanner.nextLine();
      opcao = Integer.parseInt(opcaoString);

      if (opcao == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpfEleitor = scanner.nextLine();
        System.out.println("Entre com o número da pessoa candidata:");
        String numeroCandidato = scanner.nextLine();
        gerenciamentoVotacao.votar(cpfEleitor, Integer.parseInt(numeroCandidato));
      } else if (opcao == 2) {
        gerenciamentoVotacao.mostrarResultado();
      }
    }
    gerenciamentoVotacao.mostrarResultado();
  }
}
