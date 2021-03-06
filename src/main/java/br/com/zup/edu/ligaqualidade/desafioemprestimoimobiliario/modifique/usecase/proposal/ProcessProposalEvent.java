package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.usecase.proposal;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Proposal;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.entrypoint.events.dto.EventDto;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.entrypoint.events.proposal.dto.ProposalCreatedDto;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.entrypoint.events.proposal.dto.ProposalDeletedDto;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.entrypoint.events.proposal.dto.ProposalUpdatedDto;

import java.util.List;

public class ProcessProposalEvent {

    public static void execute(List<Proposal> proposals, EventDto eventDto) {

        Proposal proposal;

        switch (eventDto.getAction()) {
            case "created":
                proposals.add(CreateProposalByEvent.execute(new ProposalCreatedDto(eventDto.getData())));
                break;

            case "updated":
                ProposalUpdatedDto proposalUpdatedDto = new ProposalUpdatedDto(eventDto.getData());
                proposal = FindProposalById.execute(proposals, proposalUpdatedDto.getProposalId());
                UpdateProposalByEvent.execute(proposal, proposalUpdatedDto);
                break;

            case "deleted":
                ProposalDeletedDto proposalDeletedDto = new ProposalDeletedDto(eventDto.getData());
                proposal = FindProposalById.execute(proposals, proposalDeletedDto.getProposalId());
                proposals.remove(proposal);
                break;
        }
    }

}
