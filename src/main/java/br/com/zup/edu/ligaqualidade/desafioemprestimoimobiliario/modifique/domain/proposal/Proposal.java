package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Proposal {

    private String id;
    private BigDecimal loanValue;
    private Integer installments;
    private List<Warranty> warranties;
    private List<Proponent> proponents;
    private Proponent mainProponent;

    public Proposal(String id, BigDecimal loanValue, Integer installments) {
        this.id = id;
        this.loanValue = loanValue;
        this.installments = installments;
        this.warranties = new ArrayList<>();
        this.proponents = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public BigDecimal getLoanValue() {
        return loanValue;
    }

    public Integer getInstallments() {
        return installments;
    }

    public List<Proponent> getProponents() {
        return proponents;
    }

    public Proponent getMainProponent() {
        return mainProponent;
    }

    public void setLoanValue(BigDecimal loanValue) {
        this.loanValue = loanValue;
    }

    public void setInstallments(Integer installments) {
        this.installments = installments;
    }

    public List<Warranty> getWarranties() {
        return warranties;
    }

    public void addWarranty(Warranty warranty) {
        this.warranties.add(warranty);
    }

    public void addProponent(Proponent proponent, Boolean isMain) {
        if (isMain) {
            this.mainProponent = proponent;
        }
        this.proponents.add(proponent);
    }

    public Boolean hasUnderAge() {
        return this.getProponents()
                .stream()
                .anyMatch(proponent -> proponent.getAge() < 18);
    }

}
