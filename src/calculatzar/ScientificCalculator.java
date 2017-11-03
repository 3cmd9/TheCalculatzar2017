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
    
    public static double pythagorean(double a, double b){
        return distance(0,0,a,b);
    }
    
    public static double distance (double x1,double y1,double x2, double y2){
        return Math.sqrt((Math.pow(x1,2)-Math.pow(x2,2))+(Math.pow(y1,2)-Math.pow(y2,2)));
    }
}
