package br.com.alura.hr.service.readjustment;

import br.com.alura.hr.exception.ValidationException;
import br.com.alura.hr.model.Employee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidationPeriodicityBetweenReadjustment implements ReadjustmentValidation {
    @Override
    public void validation(Employee employee, BigDecimal readjustment) {
        LocalDate lastReadjustmentDate = employee.getLastReadjustmentDate();
        LocalDate currentDate = LocalDate.now();

        Long monthsSinceLastReadjustment = ChronoUnit.MONTHS.between(lastReadjustmentDate, currentDate);

        if (monthsSinceLastReadjustment < 6) {
            throw new ValidationException("Interval between readjustments must be at least 6 months!");
        }
    }
}
