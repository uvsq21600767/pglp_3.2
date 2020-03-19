package fr.uvsq;

public class Vendeur extends AllEmploye {

    final private int base = 2000;
    private int com;

    public Vendeur(int com) {
        this.com = com;
    }

    @Override
    public double salaire() {
        return base + com;
    }
}
