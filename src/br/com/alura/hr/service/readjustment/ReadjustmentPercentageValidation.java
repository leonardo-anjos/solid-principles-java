package br.com.alura.hr.service.readjustment;

import br.com.alura.hr.exception.ValidationException;
import br.com.alura.hr.model.Employee;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ReadjustmentPercentageValidation implements ReadjustmentValidation {
    @Override
    public void validation(Employee employee, BigDecimal readjustment) {
        BigDecimal currentWage = employee.getWage();
        BigDecimal readjustmentPercentage = readjustment.divide(currentWage, RoundingMode.HALF_UP);

        if (readjustmentPercentage.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidationException("Readjustment cannot exceed 40% of salary!");
        }
    }
}
