package br.com.alura.hr.service.taxation;

import java.math.BigDecimal;

public interface TaxableAdjustment extends Readjustment {
    BigDecimal incomeTaxAmount();
}
