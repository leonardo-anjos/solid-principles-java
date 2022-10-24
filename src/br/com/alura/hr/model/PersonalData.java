package br.com.alura.hr.model;

import java.math.BigDecimal;

public class PersonalData {

    private String name;
    private String identification;
    private Position position;
    private BigDecimal wage;

    public PersonalData(String name, String identification, Position position, BigDecimal wage) {
        this.name = name;
        this.identification = identification;
        this.position = position;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public String getIdentification() {
        return identification;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public BigDecimal getWage() {
        return wage;
    }

    public void setWage(BigDecimal wage) {
        this.wage = wage;
    }
}
