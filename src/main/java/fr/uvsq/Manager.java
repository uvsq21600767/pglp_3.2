package fr.uvsq;

public class Manager extends AllEmploye {

    private final int base = 1500;
    private int nbEmployes;

    public Manager(int nbEmployes) {
        this.nbEmployes = nbEmployes;
    }

    @Override
    public double salaire() {
        return base+(nbEmployes*100);
    }
}
