package Exo1.questionB;

import Exo1.questionA.Employee;

/**
 * Cette classe fournit des méthodes pour gérer les employés.
 */
public class EmployeeManager {

    /**
     * Calcule le salaire de base d'un employé en fonction de son niveau d'expérience.
     *
     * @param employee L'employé pour lequel calculer le salaire.
     * @return Le salaire de base de l'employé.
     * @throws IllegalArgumentException Si le niveau d'expérience de l'employé est invalide.
     */
    public static double calculateSalary(Employee employee) {
        double baseSalary;
        switch (employee.level) {
            case "Junior" :
                baseSalary = 20000;
                break;
            case "Intermédiaire":
            case "Intermediate":
                baseSalary = 40000;
                break;
            case "Sénior":
            case "Senior":
                baseSalary = 60000;
                break;
            default:
                throw new IllegalArgumentException("Niveau d'expérience invalide : " + employee.level);
        }
        return baseSalary;
    }

    /**
     * Calcule le coefficient d'ancienneté en fonction du nombre d'années d'expérience.
     *
     * @param anneesExperience Le nombre d'années d'expérience.
     * @return Le coefficient d'ancienneté calculé.
     */
    public static double calculateExperienceMultiplier(int anneesExperience) {
        return 1 + (anneesExperience * 0.05);
    }
}