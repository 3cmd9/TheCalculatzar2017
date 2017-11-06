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

    public void displacementKinematicsSolver() {

        System.out.println("Time:");
        double t = s.nextDouble();

        System.out.println("Acceleration:");
        double a = s.nextDouble();

        System.out.println("Initial Velocity:");
        double i = s.nextDouble();

        System.out.println("Final Velocity:");
        double f = s.nextDouble();

        System.out.println("Displacement = " + i * t + (1 / 2) * a * Math.pow(t, 2));
    }

    public void sound() {

    }

    //glen
   public void thermodynamics() {
        //Ideal Gas Law
        double Pressure = s.nextDouble();
        double Volume = s.nextDouble();
        double n = s.nextDouble();
        //(L*mmHg)/(mol*K)
        double gasConstant = 62.4;
        double temp = s.nextDouble();
        //solve for pressure
        Pressure = (n*gasConstant*temp)/Volume;
        //solve for Volume
        Volume = (n*gasConstant*temp)/Pressure;
        //solve for moles
        n = (Pressure*Volume)/(gasConstant*temp);
        //solve for temperature
        temp = (Pressure*Volume)/(n*gasConstant);
    }

    public void gas() {

    }

    //carson
    public void energy() {

    }

    public void gravity() {

    }

    //asher
    public void stoich() {

    }

    public void balance() {

    }

    public void getChem() {

    }
}
