package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal;

import java.math.BigDecimal;

public class Warranty {

    private String id;
    private BigDecimal value;
    private String province;

    public Warranty(String id, BigDecimal value, String province) {
        this.id = id;
        this.value = value;
        this.province = province;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValue() {
        return value;
    }

    public String getProvince() {
        return province;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
