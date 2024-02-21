public class Etudiant{

private String nom;
    private int age;
    private String notes; // Nouvelle propriété notes

    // Constructeur de la classe Etudiant
    public Etudiant(String nom, int age, String notes) {
        this.nom = nom;
        this.age = age;
        this.notes = notes;
    }

    // Méthode pour afficher les informations de l'étudiant
    public void afficherInfos() {
        System.out.println("Nom : " + nom);
        System.out.println("Age : " + age);
        System.out.println("Notes : " + notes); // Afficher les notes
    }

    // Méthode pour définir le nom de l'étudiant
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Méthode pour définir l'âge de l'étudiant
    public void setAge(int age) {
        this.age = age;
    }

    // Méthode pour définir les notes de l'étudiant
    public void setNotes(String notes) {
        this.notes = notes;
    }
system.out.println("hello");
}