package br.com.alura.hr.service.promotion;

import br.com.alura.hr.exception.ValidationException;
import br.com.alura.hr.model.Employee;
import br.com.alura.hr.model.Position;

public class PromotionService {
    public void promote(Employee employee, Boolean goalHit) {
        Position currentPosition = employee.getPosition();

        if (Position.MANAGER == currentPosition) {
            throw new ValidationException("Managers cannot be promoted!");
        }

        if (!goalHit){
            throw new ValidationException("Employee did not reach the goal!");
        }

        Position newPosition = currentPosition.getNextPosition();
        employee.promote(newPosition);
    }
}
