package br.com.alura.hr.service.taxation;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Readjustment {
    BigDecimal value();
    LocalDate date();
}
