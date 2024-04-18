package Exo1.questionA;

/**
 * Cette classe représente un employé.
 */
public class Employee {
    // Attributs

    /** Le prénom de l'employé. */
    public String firstName;

    /** Le nom de famille de l'employé. */
    public String lastName;

    /** Le nombre d'années d'expérience de l'employé. */
    public int anneesExperience;

    /** Le niveau d'expérience de l'employé (Junior, Intermédiaire, Senior). */
    public String level;

    // Constructeur

    /**
     * Constructeur de la classe Employee.
     *
     * @param firstName         Le prénom de l'employé.
     * @param lastName          Le nom de famille de l'employé.
     * @param anneesExperience  Le nombre d'années d'expérience de l'employé.
     * @param level             Le niveau d'expérience de l'employé (Junior, Intermédiaire, Senior).
     */
    public Employee(String firstName, String lastName, int anneesExperience, String level) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.anneesExperience = anneesExperience;
        this.level = level;
    }
}