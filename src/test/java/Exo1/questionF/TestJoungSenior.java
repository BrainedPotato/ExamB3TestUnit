package Exo1.questionF;

import org.junit.Test;
import Exo1.questionA.Employee;
import Exo1.questionB.EmployeeManager;

import static org.junit.Assert.assertEquals;

public class TestJoungSenior {

    @Test
    public void Senior10yearsExp() {
        Employee seniorEmployee = new Employee("Test", "Employee", 10, "Sénior");
        double baseSalary = EmployeeManager.calculateSalary(seniorEmployee);
        double experienceMultiplier = EmployeeManager.calculateExperienceMultiplier(seniorEmployee.anneesExperience);

        double expectedSalary = baseSalary * experienceMultiplier;

        assertEquals("Test senior erroné", expectedSalary, 60000 * 1.50, 0.1); // Utilisation de delta pour prendre en compte les différences de précision
    }
}