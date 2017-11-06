/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatzar;

import java.util.Scanner;

/**
 * Remember: All Methods Static, ask Richard for method Signature
 *
 * Methods: convertToBase(int base, int num); Luke convertToDecimal(int
 * currentBase, int num); Leo add (int num1, int num2, int base); Richard
 * subtract(int num1, int num2, int base); Kaiyi multiply(int num1, int num2,
 * int base); Luke divide(int num1, int num2 int base); Leo square(int num, int
 * base); Richard squareRoot(int, num, int base); Kaiyi
 */
public class BaseCalculator {
    
    public static void menu() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Choose something");
        System.out.println("1. Convert decimal to base");
        System.out.println("2. Convert base to decimal");
        System.out.println("3. Add Numbers");
        System.out.println("4. Subtract Numbers");
        System.out.println("5. Multiply Numbers");
        System.out.println("6. Divide Numbers");
        System.out.println("7. Square a Number");
        System.out.println("8. Square Root a Number");
        
        int choice = scan.nextInt();
        
        int num1, num2, base;
        switch(choice) {
            case 1:
                System.out.print("What is the number: ");
                num1 = scan.nextInt();
                
                System.out.print("What base is it in: ");
                base = scan.nextInt();
                
                convertToBase(num1, base);
                break;
            case 2:
                System.out.print("What is the number: ");
                num1 = scan.nextInt();
                
                System.out.print("What base is it in: ");
                base = scan.nextInt();
                
                convertToDecimal(num1, base);
                break;
            case 3:
                System.out.print("What is the first number: ");
                num1 = scan.nextInt();
                
                System.out.print("What is the second number: ");
                num2 = scan.nextInt();
                
                System.out.print("What base are they in: ");
                base = scan.nextInt();
                
                
                break;
            case 4: 
                System.out.print("What is the first number: ");
                num1 = scan.nextInt();
                
                System.out.print("What is the second number: ");
                num2 = scan.nextInt();
                
                System.out.print("What base are they in: ");
                base = scan.nextInt();
                
                break;
            case 5: 
                System.out.print("What is the first number: ");
                num1 = scan.nextInt();
                
                System.out.print("What is the second number: ");
                num2 = scan.nextInt();
                
                System.out.print("What base are they in: ");
                base = scan.nextInt();
                 
                break;
            case 6:
                System.out.print("What is the first number: ");
                num1 = scan.nextInt();
                
                System.out.print("What is the second number: ");
                num2 = scan.nextInt();
                
                System.out.print("What base are they in: ");
                base = scan.nextInt();
                
                break;
            case 7: 
                System.out.print("What is the number: ");
                num1 = scan.nextInt();
                
                System.out.print("What base is it in: ");
                base = scan.nextInt();
                
                break;
            case 8:
                System.out.print("What is the number: ");
                num1 = scan.nextInt();
                
                System.out.print("What base is it in: ");
                base = scan.nextInt();
                
                break;
            default:
                System.out.print("Imvalid Choice");
                break;
        }
    }

    public static String convertToBase(int num, int base) {
        return null;
    }

    public static int convertToDecimal(String num, int currentBase) {
        return 0;
    }

    public static String add(String num1, String num2, int base) {
        int numInDecimal1 = convertToDecimal(num1, base);
        int numInDecimal2 = convertToDecimal(num2, base);

        String sum = convertToBase(numInDecimal1 + numInDecimal2, base);

        return sum;
    }

    public static String subtract(String num1, String num2, int base) {
        int numInDecimal1 = convertToDecimal(num1, base);
        int numInDecimal2 = convertToDecimal(num2, base);

        String sum = convertToBase(numInDecimal1 - numInDecimal2, base);

        return sum;
    }
    
    public static String multiply(String num1, String num2, int base){
        int numInDecimal1 = convertToDecimal(num1, base);
        int numInDecimal2 = convertToDecimal(num2, base);
        
        String multipliedValue = convertToBase(numInDecimal1 * numInDecimal2, base);
        
        return multipliedValue;
    }
    
    public static String divide(String num1, String num2, int base){
        int numInDecimal1 = convertToDecimal(num1, base);
        int numInDecimal2 = convertToDecimal(num2, base);
        
        String multipliedValue = convertToBase(numInDecimal1 / numInDecimal2, base);
        
        return multipliedValue;
    }

    public static String square(String num, int base) {
        int numInDecimal = convertToDecimal(num, base);

        int squaredNum = numInDecimal * numInDecimal;

        String baseSquaredNum = convertToBase(squaredNum, base);

        return baseSquaredNum;
    }

    public static String squareRoot(String num, int base) {
        int numberInDec = convertToDecimal(num, base);
        int sqrtNum = (int) Math.pow(numberInDec, 1 / base);
        String baseSqrtNum = convertToBase(sqrtNum, base);
        return baseSqrtNum;
    }
}
