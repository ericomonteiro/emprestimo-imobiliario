package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.usecase.proposal;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Proposal;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Warranty;

public class FindWarrantyInProposalById {

    public static Warranty execute(Proposal proposal, String warrantyId) {
        return proposal.getWarranties()
                .stream()
                .filter(w -> w.getId().equals(warrantyId))
                .findFirst()
                .get();
    }

}
