package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.entrypoint.events.proposal.dto;

public class WarrantyRemovedDto {
    private final String proposalId;
    private final String warrantyId;

    private static Integer PROPOSAL_ID_INDEX = 0;
    private static Integer WARRANTY_ID_INDEX = 1;

    public WarrantyRemovedDto(String[] eventData) {
        this.proposalId = eventData[PROPOSAL_ID_INDEX];
        this.warrantyId = eventData[WARRANTY_ID_INDEX];
    }

    public String getProposalId() {
        return proposalId;
    }

    public String getWarrantyId() {
        return warrantyId;
    }
}
