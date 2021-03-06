package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.usecase.proposal;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Proposal;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Warranty;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.entrypoint.events.dto.EventDto;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.entrypoint.events.proposal.dto.WarrantyAddedDto;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.entrypoint.events.proposal.dto.WarrantyRemovedDto;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.entrypoint.events.proposal.dto.WarrantyUpdatedDto;

import java.util.List;

public class ProcessWarrantyEvent {
    public static void execute(List<Proposal> proposals, EventDto eventDto) {

        Proposal proposal;
        Warranty warranty;

        switch (eventDto.getAction()) {
            case "added":
                WarrantyAddedDto warrantyAddedDto = new WarrantyAddedDto(eventDto.getData());
                proposal = FindProposalById.execute(proposals, warrantyAddedDto.getProposalId());
                AddWarrantyByEvent.execute(proposal, warrantyAddedDto);
                break;

            case "updated":
                WarrantyUpdatedDto warrantyUpdatedDto = new WarrantyUpdatedDto(eventDto.getData());
                proposal = FindProposalById.execute(proposals, warrantyUpdatedDto.getProposalId());
                warranty = FindWarrantyInProposalById.execute(proposal, warrantyUpdatedDto.getWarrantyId());
                UpdateWarrantyByEvent.execute(warranty, warrantyUpdatedDto);
                break;

            case "removed":
                WarrantyRemovedDto warrantyRemovedDto = new WarrantyRemovedDto(eventDto.getData());
                proposal = FindProposalById.execute(proposals, warrantyRemovedDto.getProposalId());
                warranty = FindWarrantyInProposalById.execute(proposal, warrantyRemovedDto.getWarrantyId());
                proposal.getWarranties().remove(warranty);
                break;
        }
    }
}
