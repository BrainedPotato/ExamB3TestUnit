package Exo1.questionD;

import org.junit.Test;
import Exo1.questionA.Employee;
import Exo1.questionB.EmployeeManager;

import static org.junit.Assert.assertEquals;

public class TestJunior {

    @Test
    public void Junior1yearExp() {
        Employee juniorEmployee = new Employee("Test", "Employee", 1, "Junior");
        double baseSalary = EmployeeManager.calculateSalary(juniorEmployee);
        double experienceMultiplier = EmployeeManager.calculateExperienceMultiplier(juniorEmployee.anneesExperience);

        // Salaire attendu = Salaire de base * Coefficient d'ancienneté
        double expectedSalary = baseSalary * experienceMultiplier;

        // Vérification du résultat
        assertEquals("Test junior erroné", expectedSalary, 20000 * 1.05, 0.1); // Utilisation de delta pour prendre en compte les différences de précision
    }
}