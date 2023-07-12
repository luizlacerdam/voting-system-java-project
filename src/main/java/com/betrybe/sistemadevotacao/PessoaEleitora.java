package com.betrybe.sistemadevotacao;

/**
 * Classe PessoaEleitora.
 */
public class PessoaEleitora extends Pessoa {
  /**
   * Atributos e metodos.
   */
  private String cpf;

  public PessoaEleitora(String cpf, String nome) {
    super(nome);
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
