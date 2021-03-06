package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.entrypoint.events.proposal.dto;

import java.math.BigDecimal;

public class ProponentAddedDto {
    private String proposalId;
    private String proponentId;
    private String proponentName;
    private Integer proponentAge;
    private BigDecimal proponentIncome;
    private Boolean isMain;

    private static Integer PROPOSAL_ID_INDEX = 0;

    private static Integer PROPONENT_ID_INDEX = 1;
    private static Integer PROPONENT_NAME_INDEX = 2;
    private static Integer PROPONENT_AGE_INDEX = 3;
    private static Integer PROPONENT_INCOME_INDEX = 4;
    private static Integer IS_MAIN_INDEX = 5;
    public ProponentAddedDto(String[] eventData) {
        this.proposalId = eventData[PROPOSAL_ID_INDEX];
        this.proponentId = eventData[PROPONENT_ID_INDEX];
        this.proponentName = eventData[PROPONENT_NAME_INDEX];
        this.proponentAge = Integer.valueOf(eventData[PROPONENT_AGE_INDEX]);
        this.proponentIncome = new BigDecimal(eventData[PROPONENT_INCOME_INDEX]);
        this.isMain = Boolean.valueOf(eventData[IS_MAIN_INDEX]);
    }

    public String getProposalId() {
        return proposalId;
    }

    public String getProponentId() {
        return proponentId;
    }

    public String getProponentName() {
        return proponentName;
    }

    public Integer getProponentAge() {
        return proponentAge;
    }

    public BigDecimal getProponentIncome() {
        return proponentIncome;
    }

    public Boolean getMain() {
        return isMain;
    }

}
