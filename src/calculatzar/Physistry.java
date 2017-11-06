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
        
    }

    public void gas() {

    }

    //carson
    public void energy() {

    }

    public void gravity() {

    }

    //asher
    public double wavelength() {
        double h = 6.63 * Math.pow(10, -34);
        double w = 0;
        double v = 0;
        double m = 0;
        char a = 'w';
        System.out.println("input w(wavelength), v(velocity), or m(mass)");
        a = s.next().charAt(0);
        switch(a){
            case 'v':
                System.out.println("input mass");
                m = s.nextDouble();
                System.out.println("input wavelength");
                w = s.nextDouble();
                return (h/(m*w));
            case 'm':
                System.out.println("input velocity");
                v = s.nextDouble();
                System.out.println("input wavelength");
                w = s.nextDouble();
                return (h/(v*w));    
            default:
                System.out.println("input mass");
                m = s.nextDouble();
                System.out.println("input velocity");
                v = s.nextDouble();
                return (h/(m*v));
        }
         
    }
    
    public double momentum() {
        double p = 0;
        double v = 0;
        double m = 0;
        char a = 'p';
        System.out.println("input p(momentum), v(velocity), or m(mass)");
        a = s.next().charAt(0);
        switch(a){
            case 'v':
                System.out.println("input mass");
                m = s.nextDouble();
                System.out.println("input momentum");
                p = s.nextDouble();
                return (m/p);
            case 'm':
                System.out.println("input velocity");
                v = s.nextDouble();
                System.out.println("input momentum");
                p = s.nextDouble();
                return (v/p);    
            default:
                System.out.println("input mass");
                m = s.nextDouble();
                System.out.println("input velocity");
                v = s.nextDouble();
                return (m*v);
        }
    }

    
}
