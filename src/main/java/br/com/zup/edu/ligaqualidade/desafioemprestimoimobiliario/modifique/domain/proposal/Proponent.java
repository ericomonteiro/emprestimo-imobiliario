package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal;

import java.math.BigDecimal;

public class Proponent {
    private String id;
    private String name;
    private Integer age;
    private BigDecimal income;

    public Proponent(String id, String name, Integer age, BigDecimal income) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.income = income;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public BigDecimal getIncome() {
        return income;
    }
}
