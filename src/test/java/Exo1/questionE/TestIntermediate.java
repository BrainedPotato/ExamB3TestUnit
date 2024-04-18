package Exo1.questionE;

import org.junit.Test;
import Exo1.questionA.Employee;
import Exo1.questionB.EmployeeManager;

import static org.junit.Assert.assertEquals;

public class TestIntermediate {

    @Test
    public void Intermediate5yearsExp() {
        Employee intermediateEmployee = new Employee("Test", "Employee", 5, "Intermédiaire");
        double baseSalary = EmployeeManager.calculateSalary(intermediateEmployee);
        double experienceMultiplier = EmployeeManager.calculateExperienceMultiplier(intermediateEmployee.anneesExperience);

        // Salaire attendu = Salaire de base * Coefficient d'ancienneté
        double expectedSalary = baseSalary * experienceMultiplier;

        // Vérification du résultat
        assertEquals("Test intermédiaire erroné", expectedSalary, 40000 * 1.25, 0.1); // Utilisation de delta pour prendre en compte les différences de précision
    }
}