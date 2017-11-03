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
    
    //area of a triangle/rectangle
public double area(double base, double height, String shape)    {
    if (shape.equalsIgnoreCase("triangle"))
    return (base * height)/2;   
    //if not a triangle, with these measurements its gotta be a square/rectangle, to l*w
    else return base * height;
}    
//for area of a trapezoid
public double area(double topLen, double botLen, double height)   {
    //find area of square in the middle of a trapazoid
    double sqArea;
    if (botLen > topLen)     sqArea = topLen * height; else sqArea = botLen * height;
    
    //find triangles area using triangle formula with the height and the difference between the lengths
    double trArea = (Math.abs(topLen - botLen) * height / 2);
    //return 2 areas together
    return sqArea + trArea;
}


    //Method to find length of hypotenuse
    public static double pythagorean(double a, double b){
        return distance(0,0,a,b);
    }
    
    //Method to determine distance from two coordinate pairs
    public static double distance (double x1,double y1,double x2, double y2){
        return Math.sqrt((Math.pow(x1,2)-Math.pow(x2,2))+(Math.pow(y1,2)-Math.pow(y2,2)));
    }
    
    public static double positiveQuadFormula(double a, double b, double c){
        return (-b+Math.sqrt(Math.pow(a,2)-4*a*c))/(2*a);
    }
    
    //Method to represent value in scientific notation
//    public static String sciNote(double data){
//        return 
//    }
//    //Later
//    public static double derivative(){
//        
//    }
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
