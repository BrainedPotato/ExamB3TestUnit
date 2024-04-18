package Exo1.questionG;

import org.junit.Test;
import Exo1.questionA.Employee;
import Exo1.questionB.EmployeeManager;

import static org.junit.Assert.assertEquals;

public class TestOldSenior {

    @Test
    public void Senior20yearsExp() {
        Employee seniorEmployee = new Employee("Test", "Employee", 20, "Sénior");
        double baseSalary = EmployeeManager.calculateSalary(seniorEmployee);
        double experienceMultiplier = EmployeeManager.calculateExperienceMultiplier(seniorEmployee.anneesExperience);

        double expectedSalary = baseSalary * experienceMultiplier;

        assertEquals("Test senior erroné", expectedSalary, 60000 * 2.0, 0.1); // Utilisation de delta pour prendre en compte les différences de précision
    }
}