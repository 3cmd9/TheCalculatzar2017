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
        String out = "";
        while(num != 0){
            if(num%base > 9){
                out += (char)64 + ((num%base) -9);
            }else{
                out += num%base;
            }
            num/=base;
        }
        return out;
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
