package fr.uvsq;

public class Employe extends AllEmploye {

    final private int salaire = 1500;
    private int startYear;

    public Employe(int startYear) {
        this.startYear = startYear;
    }

    @Override
    public double salaire() {
        return salaire+(2020-this.startYear)*20;
    }
}
