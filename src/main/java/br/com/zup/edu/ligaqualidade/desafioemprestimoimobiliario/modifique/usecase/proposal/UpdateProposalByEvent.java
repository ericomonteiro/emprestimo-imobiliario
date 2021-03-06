package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.usecase.proposal;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Proposal;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.entrypoint.events.proposal.dto.ProposalUpdatedDto;

public class UpdateProposalByEvent {

    public static void execute(Proposal proposal, ProposalUpdatedDto event) {
        proposal.setLoanValue(event.getLoanValue());
        proposal.setInstallments(event.getInstallments());
    }

}
