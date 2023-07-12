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

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getVotos() {
    return votos;
  }

  public void setVotos(int votos) {
    this.votos = votos;
  }
}
