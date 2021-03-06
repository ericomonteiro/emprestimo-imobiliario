package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.entrypoint.events.proposal.dto;

public class ProposalDeletedDto {
    private final String proposalId;

    private static Integer PROPOSAL_ID_INDEX = 0;

    public ProposalDeletedDto(String[] eventData) {
        this.proposalId = eventData[PROPOSAL_ID_INDEX];
    }

    public String getProposalId() {
        return proposalId;
    }
}
