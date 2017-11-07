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

    Scanner s = new Scanner(System.in);

    //sanjula
    public void displacementKinematicsSolver() { 
        System.out.println("Time (s):");
        double time = s.nextDouble();
        System.out.println("Acceleration (m/s²):");
        double acceleration = s.nextDouble();
        System.out.println("Initial Velocity (m/s):");
        double velocityI = s.nextDouble();
        System.out.println("Final Velocity (m/s):");
        double velovityF = s.nextDouble();
        System.out.println("Displacement = " + (velocityI * time + (1 / 2) * acceleration * Math.pow(time, 2)) + "m");
    }

    public void dopplerEffect() {
        System.out.println("Frequency of Source:");
        double frequency = s.nextDouble();
        System.out.println("Speed of Wave:");
        double wave = s.nextDouble();
        System.out.println("Speed of Detector:");
        double detector = s.nextDouble();
        System.out.println("Speed of Sourcee:");
        double source = s.nextDouble();
        System.out.println("Doppler Frequency = " + frequency * ((wave + detector) / (wave - source)));
    }

    //glen
    public void specificHeatinWater() {
        //in Joules
        double q;
        //in grams
        System.out.println("Input the mass of the substance in GRAMS");
        double mass = s.nextDouble();
        //in water, in J/g*temp in Celcius
        double specificHeat = 4.18;
        //in celcius
        System.out.println("Input initial temperature in CELCIUS");
        double initTemp = s.nextDouble();
        //in celcius
        System.out.println("Input final temperature in CELCIUS");
        double finalTemp = s.nextDouble();
        q = mass * specificHeat * (finalTemp - initTemp);
        System.out.println("Heat energy required = " + q + " Joules");
    }

    public void idealGasLaw4Pressure() {
        //Ideal Gas Law
        double Pressure;
        System.out.println("Input volume in LITRES");
        double Volume = s.nextDouble();
        System.out.println("Input moles in MOL");
        double n = s.nextDouble();
        //(L*mmHg)/(mol*K)
        double gasConstant = 62.4;
        System.out.println("Input temperature in KELVIN");
        double temp = s.nextDouble();
        //solve for pressure
        Pressure = (n * gasConstant * temp) / Volume;
        System.out.println("Pressure = " + Pressure + " mmHg");
    }

    //carson
    public double energy() {
       System.out.println("This Program Will Return Kinetic Energy");
       System.out.print("Enter Mass (KG): ");
       double m = s.nextDouble();
       System.out.print("Enter Speed of Object: ");
       double v = s.nextDouble();
       double Ek = ((Math.pow(v,2))*m)/2;
       return Ek;
    }

    public double gravity() {
        final double G = 6.67*Math.pow(10, -11);
        System.out.println("This Program Will Return The Force of Gravity");
        System.out.print("Enter Mass 1 (KG): ");
        double m1 = s.nextDouble();
        System.out.print("Enter Mass 2 (KG): ");
        double m2 = s.nextDouble();
        System.out.print("Enter Distance between Mass 1 and Mass 2: ");
        double r = s.nextDouble();
        double F = (G*m1*m2)/(Math.pow(r, 2));
        System.out.println(F);
        return F;
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
        switch (a) {
            case 'v':
                System.out.println("input mass");
                m = s.nextDouble();
                System.out.println("input wavelength");
                w = s.nextDouble();
                return (h / (m * w));
            case 'm':
                System.out.println("input velocity");
                v = s.nextDouble();
                System.out.println("input wavelength");
                w = s.nextDouble();
                return (h / (v * w));
            default:
                System.out.println("input mass");
                m = s.nextDouble();
                System.out.println("input velocity");
                v = s.nextDouble();
                return (h / (m * v));
        }

    }

    public double momentum() {
        double p = 0;
        double v = 0;
        double m = 0;
        char a = 'p';
        System.out.println("input p(momentum), v(velocity), or m(mass)");
        a = s.next().charAt(0);
        switch (a) {
            case 'v':
                System.out.println("input mass");
                m = s.nextDouble();
                System.out.println("input momentum");
                p = s.nextDouble();
                return (m / p);
            case 'm':
                System.out.println("input velocity");
                v = s.nextDouble();
                System.out.println("input momentum");
                p = s.nextDouble();
                return (v / p);
            default:
                System.out.println("input mass");
                m = s.nextDouble();
                System.out.println("input velocity");
                v = s.nextDouble();
                return (m * v);
        }
    }

}
