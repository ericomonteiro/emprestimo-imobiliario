package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.entrypoint.events.proposal.dto;

import java.math.BigDecimal;

public class WarrantyAddedDto {
    private final String proposalId;
    private final String warrantyId;
    private final BigDecimal warrantyValue;
    private final String warrantProvince;

    private static Integer PROPOSAL_ID_INDEX = 0;
    private static Integer WARRANTY_ID_INDEX = 1;
    private static Integer WARRANTY_VALUE_INDEX = 2;
    private static Integer WARRANT_PROVINCE_INDEX = 3;

    public WarrantyAddedDto(String[] eventData) {
        this.proposalId = eventData[PROPOSAL_ID_INDEX];
        this.warrantyId = eventData[WARRANTY_ID_INDEX];
        this.warrantyValue = new BigDecimal(eventData[WARRANTY_VALUE_INDEX]);
        this.warrantProvince = eventData[WARRANT_PROVINCE_INDEX];
    }

    public String getProposalId() {
        return proposalId;
    }

    public String getWarrantyId() {
        return warrantyId;
    }

    public BigDecimal getWarrantyValue() {
        return warrantyValue;
    }

    public String getWarrantProvince() {
        return warrantProvince;
    }
}
