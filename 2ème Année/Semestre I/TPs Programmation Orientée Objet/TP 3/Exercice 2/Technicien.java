public class Technicien extends Employe {
    private int grade;  // 1, 2 ou 3


    public Technicien() {
        super();
        this.grade = 1;
    }

    public Technicien(String nom, String prenom, int age, double salaire, int grade) {
        super(nom, prenom, age, salaire);
        if (grade >= 1 && grade <= 3) this.grade = grade;
    }


    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 3) this.grade = grade;
    }

    public int getGrade() {
        return this.grade;
    }


    public int prime() {
        return this.grade * 100;
    }

    public String toString() {
        return super.toString() + " et a pour grade " + this.grade;
    }

    public void augmentation() {
        this.setSalaire(this.getSalaire() + (double)this.prime());
    }
}
