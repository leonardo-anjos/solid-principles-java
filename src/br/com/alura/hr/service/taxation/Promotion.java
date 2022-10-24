package br.com.alura.hr.service.taxation;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promotion implements TaxableAdjustment {
    private BigDecimal value;
    private LocalDate date;

    public Promotion(BigDecimal value) {
        this.value = value;
        this.date = LocalDate.now();
    }

    @Override
    public BigDecimal value() {
        return null;
    }

    @Override
    public LocalDate date() {
        return null;
    }

    @Override
    public BigDecimal incomeTaxAmount() {
        return value.multiply(new BigDecimal("0.1"));
    }
}
