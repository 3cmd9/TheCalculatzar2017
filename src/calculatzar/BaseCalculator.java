/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatzar;

/**
 *Remember: All Methods Static, ask Richard for method Signature
 * 
 * Methods:
 *  convertToBase(int base, int num);               Luke
 *  convertToDecimal(int currentBase, int num);     Leo
 *  add (int num1, int num2, int base);             Richard
 *  subtract(int num1, int num2, int base);         Kaiyi
 *  multiply(int num1, int num2, int base_;         Luke
 *  divide(int num1, int num2 int base);            Leo
 *  square(int num, int base);                      Richard
 *  squareRoot(int, num, int base);                 Kaiyi
 */
public class BaseCalculator {
    
    public static String convertToBase(int num, int base){
        return null;
    }
    
    public static int convertToDecimal(String num, int currentBase){
        return 0;
    }
    
    public static String add (String num1, String num2, int base){
        int numInDecimal1 = convertToDecimal(num1, base);
        int numInDecimal2 = convertToDecimal(num2, base);
        
        String sum = convertToBase(numInDecimal1 + numInDecimal2, base);
        
        return sum;
    }
    
    public static String subtract(String num1, String num2, int base){
        return null;
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
    
    public static String square(String num, int base){
        int numInDecimal = convertToDecimal(num, base);
        
        int squaredNum = numInDecimal * numInDecimal;
        
        String baseSquaredNum = convertToBase(squaredNum, base);
        
        return baseSquaredNum;
    }
    
    public static String squareRoot(int num, int base){
        return null;
    }
}
