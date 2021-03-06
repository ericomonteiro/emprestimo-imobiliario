package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.usecase.proposal;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Proponent;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Proposal;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.entrypoint.events.proposal.dto.ProponentAddedDto;

public class AddProponentByEvent {

    public static void execute(Proposal proposal, ProponentAddedDto proponentAddedDto) {

        Proponent proponent = new Proponent(proponentAddedDto.getProponentId()
                , proponentAddedDto.getProponentName()
                ,proponentAddedDto.getProponentAge()
                ,proponentAddedDto.getProponentIncome());

        proposal.addProponent(proponent, proponentAddedDto.getMain());
    }

}
