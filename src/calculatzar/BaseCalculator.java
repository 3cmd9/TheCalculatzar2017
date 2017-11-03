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
 *  convertToDecimal(int currentBase, String num);     Leo/Sean
 *  add (String num1, String num2, int base);             Richard
 *  subtract(String num1, String num2, int base);         Kaiyi
 *  multiply(String num1, String num2, int base_;         Luke
 *  divide(String num1, String num2, int base);            Leo
 *  square(String num, int base);                      Richard
 *  squareRoot(String num, int base);                 Kaiyi
 */
public class BaseCalculator {
    
    public static String convertToBase(int num, int base){
        return null;
    }
    
    public static int convertToDecimal(String num, int currentBase){
        return 0;
    }
    
    public static String add (String num1, String num2, int base){
        int number1 = convertToDecimal(num1, base);
        int number2 = convertToDecimal(num2, base);
        
        String sum = convertToBase(number1 + number2, base);
        
        return sum;
    }
    
    public static String subtract(String num1, String num2, int base){
        return null;
    }
    
    public static String multiply(String num1, String num2, int base){
        return null;
    }
    
    public static String divide(String num1, String num2, int base){
        return null;
    }
    
    public static String square(int num, int base){
        return null;
    }
    
    public static String squareRoot(int num, int base){
        return null;
    }
}
