package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

/**
 * Classe GerenciamentoVotacao.
 */
public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  /**
   * Atributos e metodos.
   */
  private ArrayList<PessoaCandidata> pessoasCandidatas;
  private ArrayList<PessoaEleitora> pessoasEleitoras;
  private ArrayList<String> cpfsComputados;

  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    PessoaCandidata pessoaCandidata = new PessoaCandidata(numero, nome);
    pessoasCandidatas.add(pessoaCandidata);
  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    PessoaEleitora pessoaEleitora = new PessoaEleitora(cpf, nome);
    pessoasEleitoras.add(pessoaEleitora);
  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
//    if (cpfsComputados.contains(cpfPessoaEleitora)) {
//      System.out.println("Pessoa eleitora já votou!");
//    } else {
//      for( PessoaCandidata pessoa : pessoasCandidatas){
//
//      }
//    }
  }

  @Override
  public void mostrarResultado() {

  }
}
