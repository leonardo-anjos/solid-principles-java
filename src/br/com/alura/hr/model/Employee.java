package br.com.alura.hr.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {
    private PersonalData personalData;
    private LocalDate lastReadjustmentDate;

    public Employee(String name, String identification, Position position, BigDecimal wage) {
        this.personalData = new PersonalData(name, identification, position, wage);
    }

    public void updateWage(BigDecimal newWage) {
        this.personalData.setWage(newWage);
        this.lastReadjustmentDate = LocalDate.now();
    }

    public void promote(Position newPosition) {
        this.personalData.setPosition(newPosition);
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

    public LocalDate getLastReadjustmentDate() {
        return lastReadjustmentDate;
    }
}
