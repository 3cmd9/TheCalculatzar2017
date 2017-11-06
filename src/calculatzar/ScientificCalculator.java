/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatzar;

import java.util.Scanner;

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
    public double pythagorean(double a, double b){
        return distance(0,0,a,b);
    }
    
    //Method to determine distance from two coordinate pairs
    public double distance (double x1,double y1,double x2, double y2){
        return Math.sqrt((Math.pow(x1,2)-Math.pow(x2,2))+(Math.pow(y1,2)-Math.pow(y2,2)));
    }
    
    public double positiveQuadFormula(double a, double b, double c){
        return (-b+Math.sqrt(Math.pow(a,2)-4*a*c))/(2*a);
    }
    
    //Method to represent value in scientific notation, not final, may be bugged
    public String sciNote(double data){
        int count = 0;
        while(data>10){
            data/=10;
            count++;
        }
        return data +"x 10^"+count;
    }
    
    //Interface
    public void menu(){
        System.out.println("Welcome to Scientific Calculator.");
        System.out.println("Press 1 to access slope function");
        System.out.println("Press 2 to access equation of line function");
        System.out.println("Press 3 to access area of triangle/rectangle function");
        System.out.println("Press 4 to access area of trapezoid function");
        System.out.println("Press 5 to access pythagorean function");
        System.out.println("Press 6 to access distance function");
        System.out.println("Press 7 to access qadratic formula (positive) function");
        System.out.println("Press 8 to access scientific notation function");
        System.out.println("Press 9 to exit");
        int input = 0;
        Scanner kb = new Scanner(System.in);
        do{
            input=kb.nextInt();
            switch(input){
                case 1:
                    slope(kb.nextDouble(),kb.nextDouble(),kb.nextDouble(),kb.nextDouble());
                    break;
                case 2:
                    equation(kb.nextDouble(),kb.nextDouble(),kb.nextDouble(),kb.nextDouble());
                    break;
                case 3:
                    area(kb.nextDouble(),kb.nextDouble(),kb.nextLine());
                    break;
                case 4:
                    area(kb.nextDouble(),kb.nextDouble(),kb.nextDouble());
                    break;
                case 5:
                    pythagorean(kb.nextDouble(),kb.nextDouble());
                    break;
                case 6:
                    distance(kb.nextDouble(),kb.nextDouble(),kb.nextDouble(),kb.nextDouble());
                    break;
                case 7:
                    positiveQuadFormula(kb.nextDouble(),kb.nextDouble(),kb.nextDouble());
                    break;
                case 8:
                    sciNote(kb.nextDouble());
                    break;
            }
        }while(input!=9);
    }
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
