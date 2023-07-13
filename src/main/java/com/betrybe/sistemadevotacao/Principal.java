package com.betrybe.sistemadevotacao;

public class Principal {

  public static void main(String[] args) {
    GerenciamentoVotacao gen1 = new GerenciamentoVotacao();
    gen1.cadastrarPessoaCandidata("Luiz", 13);
    gen1.cadastrarPessoaEleitora("Mabi", "123");
    gen1.votar("123", 13);
    gen1.votar("123", 13);

  }

}
