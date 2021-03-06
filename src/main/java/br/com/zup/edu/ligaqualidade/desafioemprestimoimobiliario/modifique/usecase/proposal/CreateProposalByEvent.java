package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.usecase.proposal;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Proposal;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.entrypoint.events.proposal.dto.ProposalCreatedDto;

public class CreateProposalByEvent {

    public static Proposal execute(ProposalCreatedDto event) {
        return new Proposal(event.getProposalId(), event.getLoanValue(), event.getInstallments());
    }

}
