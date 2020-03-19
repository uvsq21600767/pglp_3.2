package fr.uvsq;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    @Test
    public void test() {

        Vendeur v1 = new Vendeur(50);
        Vendeur v2 = new Vendeur(25);
        Employe e1 = new Employe(1998);
        Employe e2 = new Employe(2003);

        ArrayList<AllEmploye> list = new ArrayList<>();

        list.add(v1);
        list.add(e1);
        list.add(v2);
        list.add(e2);

        double salaire = 0.0;

        for(int i = 0; i < list.size(); i++) {
            salaire += list.get(i).salaire();
        }

        System.out.println("Salaire tot = " + salaire);
    }
}
