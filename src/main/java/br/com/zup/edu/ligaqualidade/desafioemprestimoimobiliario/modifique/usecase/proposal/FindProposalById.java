package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.usecase.proposal;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Proposal;

import java.util.List;

public class FindProposalById {

    public static Proposal execute(List<Proposal> proposals, String id) {
        return proposals.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .get();
    }


}
