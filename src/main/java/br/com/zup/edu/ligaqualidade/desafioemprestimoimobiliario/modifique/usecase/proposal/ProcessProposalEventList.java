package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.usecase.proposal;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Proposal;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.entrypoint.events.dto.EventDto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessProposalEventList {

    public static String execute(List<String> messages) {

        List<Proposal> proposals = new ArrayList<>();

        for (String message : messages) {
            consumeSingleMessage(message, proposals);
        }

        return proposals
                .stream()
                .filter(IsValid::execute)
                .map(Proposal::getId)
                .collect(Collectors.joining(","));
    }

    private static void consumeSingleMessage(String line, List<Proposal> proposals) {
        EventDto eventDto = new EventDto(line);


        switch (eventDto.getEventSchema()) {
            case "proposal":
                ProcessProposalEvent.execute(proposals, eventDto);
                break;

            case "warranty":
                ProcessWarrantyEvent.execute(proposals, eventDto);
                break;

            case "proponent":
                ProcessProponentEvent.execute(proposals, eventDto);
        }
    }
}
