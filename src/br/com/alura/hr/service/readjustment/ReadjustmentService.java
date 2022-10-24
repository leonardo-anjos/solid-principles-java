package br.com.alura.hr.service.readjustment;

import br.com.alura.hr.model.Employee;

import java.math.BigDecimal;
import java.util.List;

public class ReadjustmentService {
    private List<ReadjustmentValidation> validations;

    public ReadjustmentService(List<ReadjustmentValidation> validations) {
        this.validations = validations;
    }

    public void readjustEmployeeWage(Employee employee, BigDecimal readjustment) {
        this.validations.forEach(v -> v.validation(employee, readjustment));

        BigDecimal reajustedWage = employee.getWage().add(readjustment);
        employee.updateWage(reajustedWage);
    }
}
