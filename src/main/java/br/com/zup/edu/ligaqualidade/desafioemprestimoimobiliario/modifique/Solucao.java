package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.usecase.proposal.ProcessProposalEventList;

import java.util.List;

public class Solucao {
	
  public static String processMessages(List<String> messages) {
	  return ProcessProposalEventList.execute(messages);
  }
}