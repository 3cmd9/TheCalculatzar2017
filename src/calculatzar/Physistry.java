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

    public void stoich() {

    }

    public void balance() {

    }

    public void getChem() {

    }
}
