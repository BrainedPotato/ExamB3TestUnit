package Exo1.questionH;

import org.junit.Test;
import Exo1.questionA.Employee;
import Exo1.questionB.EmployeeManager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestOldJunior {

    @Test
    public void JuniorMoreSalary() {
        Employee juniorEmployee = new Employee("Test", "Employee", 80, "Junior");
        double baseSalaryJunior = EmployeeManager.calculateSalary(juniorEmployee);
        double experienceMultiplierJunior = EmployeeManager.calculateExperienceMultiplier(juniorEmployee.anneesExperience);

        // Salaire attendu = Salaire de base * Coefficient d'ancienneté
        double expectedSalaryJunior = baseSalaryJunior * experienceMultiplierJunior;

        Employee seniorEmployee = new Employee("Test", "Employee", 10, "Sénior");
        double baseSalarySenior = EmployeeManager.calculateSalary(seniorEmployee);
        double experienceMultiplierSenior = EmployeeManager.calculateExperienceMultiplier(seniorEmployee.anneesExperience);

        double expectedSalarySenior = baseSalarySenior * experienceMultiplierSenior;

        boolean juniorSalaryHigherThanSeniors = expectedSalaryJunior > expectedSalarySenior;

        // Vérification du résultat
        assertTrue("Test Junior supérieur à sénior", juniorSalaryHigherThanSeniors);
    }
}
