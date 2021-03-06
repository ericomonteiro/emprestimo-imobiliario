package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.usecase.proposal;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Proposal;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.entrypoint.events.dto.EventDto;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.entrypoint.events.proposal.dto.ProponentAddedDto;

import java.util.List;

public class ProcessProponentEvent {
    public static void execute(List<Proposal> proposals, EventDto eventDto) {

        Proposal proposal;

        switch (eventDto.getAction()) {
            case "added":
                ProponentAddedDto proponentAddedDto = new ProponentAddedDto(eventDto.getData());
                proposal = FindProposalById.execute(proposals, proponentAddedDto.getProposalId());
                AddProponentByEvent.execute(proposal, proponentAddedDto);
                break;
        }
    }
}
