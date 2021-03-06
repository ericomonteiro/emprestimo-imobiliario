package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.usecase.proposal;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Warranty;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.entrypoint.events.proposal.dto.WarrantyUpdatedDto;

public class UpdateWarrantyByEvent {

    public static void execute(Warranty warranty, WarrantyUpdatedDto warrantyUpdatedDto) {
        warranty.setValue(warrantyUpdatedDto.getWarrantyValue());
        warranty.setProvince(warrantyUpdatedDto.getWarrantProvince());
    }

}
