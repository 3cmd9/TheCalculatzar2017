/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatzar;

/**
 *
 * @author dunca
 */
public class ScientificCalculator {

    public double slope(double x, double y, double z, double a) {
        double tempA = a - y;
        double tempB = z - x;
        return tempA / tempB;
    }

    public String equation(double x, double y, double z, double a) {
        double m = slope(x, y, z, a);
        double b = y - (m * x);
        return "y = " + m + "x + " + b;
    }
}

//    //For linear functions.
//    public double tangentLineSlope(double x, double y, double m, double b) {
//        
//    }
//    
//    //For quadratic functions.
//    public double tangentLineSlope(double x, double y, double a, double h, double k, double c) {
//        
//    }
//}
