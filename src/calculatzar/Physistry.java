/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatzar;

import java.util.Scanner;

/**
 *
 * @author 073903999
 */
// dont ask about the name.
public class Physistry {
    //sanjula

    Scanner s = new Scanner(System.in);

    public void kinematics() {

        System.out.println("Displacement: ");
        
        System.out.println("Time:");
    }

    public void sound() {

    }

    //glen

    public void thermodynamics() {

    }

    public void gas() {

    }

    //carson
    public void energy() {

    }

    public double gravity() {
        final double G = 6.67*Math.pow(10, -11);
        System.out.println("Enter Mass 1 (KG): ");
        double m1 = s.nextDouble();
        System.out.println("Enter Mass 2 (KG): ");
        double m2 = s.nextDouble();
        System.out.println("Enter Distance between Mass 1 and Mass 2: ");
        double r = s.nextDouble();
        double F = (G*m1*m2)/(Math.pow(r, 2));
        System.out.println(F);
        return F;
    }

    //asher

    public void stoich() {

    }

    public void balance() {

    }

    public void getChem() {

    }
}
