package br.com.alura.hr.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Outsourced {
    private PersonalData personalData;
    private String company;

    public Outsourced(String name, String identification, Position position, BigDecimal wage, String company) {
        this.personalData = new PersonalData(name, identification, position, wage);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return personalData.getName();
    }

    public String getIdentification() {
        return personalData.getIdentification();
    }

    public Position getPosition() {
        return personalData.getPosition();
    }

    public BigDecimal getWage() {
        return personalData.getWage();
    }
}
