package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.entrypoint.events.proposal.dto;

import java.math.BigDecimal;

public class ProposalUpdatedDto {
    private final String proposalId;
    private final BigDecimal loanValue;
    private final Integer installments;

    private static Integer PROPOSAL_ID_INDEX = 0;
    private static Integer LOAN_VALUE_INDEX = 1;
    private static Integer INSTALLMENTS_INDEX = 2;

    public ProposalUpdatedDto(String[] eventData) {
        this.proposalId = eventData[PROPOSAL_ID_INDEX];
        this.loanValue = new BigDecimal(eventData[LOAN_VALUE_INDEX]);
        this.installments = Integer.valueOf(eventData[INSTALLMENTS_INDEX]);
    }

    public String getProposalId() {
        return proposalId;
    }

    public BigDecimal getLoanValue() {
        return loanValue;
    }

    public Integer getInstallments() {
        return installments;
    }
}
