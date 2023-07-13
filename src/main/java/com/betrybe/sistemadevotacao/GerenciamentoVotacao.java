package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

/**
 * Classe GerenciamentoVotacao.
 */
public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  /**
   * Atributos e metodos.
   */
  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<>();
  private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<>();
  private ArrayList<String> cpfsComputados = new ArrayList<>();

  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      if (pessoaCandidata.getNumero() == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
        break;
      }
    }
    PessoaCandidata pessoaCandidata = new PessoaCandidata(nome, numero);
    pessoasCandidatas.add(pessoaCandidata);
  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora pessoaEleitora : pessoasEleitoras) {
      if (pessoaEleitora.getCpf() == cpf) {
        System.out.println("Pessoa eleitora já cadastrada!");
        break;
      }
    }
    PessoaEleitora pessoaEleitora = new PessoaEleitora(nome, cpf);
    pessoasEleitoras.add(pessoaEleitora);
  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {

    for (String cpf : cpfsComputados) {
      if (cpf == cpfPessoaEleitora) {
        System.out.println("Pessoa eleitora já votou!");
        return;
      }
    }

    for(PessoaCandidata pessoaCandidata : pessoasCandidatas){
      if (pessoaCandidata.getNumero() == numeroPessoaCandidata) {
        pessoaCandidata.receberVoto();
        break;
      }
    }

    cpfsComputados.add(cpfPessoaEleitora);
    System.out.println(cpfsComputados);
  }

  @Override
  public void mostrarResultado() {
    int votos = cpfsComputados.size();
    if (votos == 0) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
    } else {
      for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
        double percentual = Math.round((pessoaCandidata.getVotos() * 100.0) / votos);
        System.out.println("Nome: "
            + pessoaCandidata.getNome() + " - "
            + pessoaCandidata.getVotos() + " votos " + "( " + percentual + "% ) ");
        System.out.println("Total de votos: " + votos);

      }
    }
  }
}
