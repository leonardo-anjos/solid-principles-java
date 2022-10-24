package br.com.alura.hr.service.taxation;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Annual implements Readjustment {
    private BigDecimal value;
    private LocalDate date;

    public Annual(BigDecimal value) {
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
}
