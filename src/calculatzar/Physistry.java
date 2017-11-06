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
        double time = s.nextDouble();

        System.out.println("Acceleration:");
        double acceleration = s.nextDouble();

        System.out.println("Initial Velocity:");
        double velocityI = s.nextDouble();

        System.out.println("Final Velocity:");
        double velovityF = s.nextDouble();

        System.out.println("Displacement = " + velocityI * time + (1 / 2) * acceleration * Math.pow(time, 2));
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
//        in celcius
        System.out.println("Input final temperature in CELCIUS");
        double finalTemp = s.nextDouble();
        q = mass*specificHeat*(finalTemp-initTemp);
        System.out.println("Heat energy required = "+q+" Joules");
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
        System.out.println("Pressure = "+Pressure+" mmHg");
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
