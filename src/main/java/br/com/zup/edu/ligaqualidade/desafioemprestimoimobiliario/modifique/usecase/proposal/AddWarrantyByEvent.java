package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.usecase.proposal;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Proposal;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Warranty;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.entrypoint.events.proposal.dto.WarrantyAddedDto;


public class AddWarrantyByEvent {

    public static void execute(Proposal proposal, WarrantyAddedDto warrantyAddedDto) {
        Warranty warranty = new Warranty(warrantyAddedDto.getWarrantyId(), warrantyAddedDto.getWarrantyValue(), warrantyAddedDto.getWarrantProvince());
        proposal.addWarranty(warranty);
    }

}
