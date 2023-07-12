package com.betrybe.sistemadevotacao;

/**
 * Classe PessoaCandidata.
 */
public class PessoaCandidata extends Pessoa {
  /**
   * Atributos e metodos.
   */
  private int numero;
  private int votos;

  public PessoaCandidata(int numero, String nome) {
    super();
    this.nome = nome;
    this.numero = numero;
    this.votos = 0;
  }
}
