package br.com.alura.hr.service.readjustment;

import br.com.alura.hr.model.Employee;

import java.math.BigDecimal;

public interface ReadjustmentValidation {
    void validation(Employee employee, BigDecimal readjustment);
}
