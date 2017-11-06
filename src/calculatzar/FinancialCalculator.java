/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatzar;

import java.util.Scanner;

/**
 *
 * @author Vasily Kapustin
 */
public class FinancialCalculator {
    public double [] currencyValue; 
    public double tax;
    public void menu(){
    System.out.println("Choose what you want to do:");
    System.out.println("1.Simple Interest");
    System.out.println("2.Compound Interest");
    System.out.println("3.Currency Conversion");
    System.out.println("4.Tax");
    System.out.println("5.Total Tax");
    System.out.println("6.Profit");
    System.out.println("7.Income Tax");
    System.out.println("8.Net Worth");
    System.out.println("9.Mortgage");
    
    Scanner s = new Scanner(System.in);
    switch(s.nextInt()){
        case 1:
            simpleInterest();
            break;
            case 2:
                compoundInterest();
            break;
            case 3:
                currencyConversion();
            break;
            case 4:
                tax();
            break;
            case 5:
                taxedTotal();
            break;
            case 6:
                profit();
            break;
            case 7:
                incomeTax();
            break;
            case 8:
                netWorth(new double[]{0,1,2});
            default:
                mortgage(1,1,1,1);
                break;
            
    
    }
    
    
            
    }
    public void simpleInterest(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter in the principle amount: ");
       double principle=s.nextDouble();
        System.out.println("Please enter in the number of years:");
        double year=s.nextDouble();
        System.out.println("Please enter in the interest rate, leave the percentage sign (e.g. 3% interest should be entered as 3): ");
        double interestRate=s.nextDouble();
        for(int i=0;i<year;i++){
        principle+=principle*interestRate/100;
        }
        System.out.println("Your final amount is: "+principle);
    }
    
    public void compoundInterest(){
          Scanner s = new Scanner(System.in);
        System.out.println("Please enter in the principle amount: ");
       double principle=s.nextDouble();
        System.out.println("Please enter in the number of years:");
        double year=s.nextDouble();
        System.out.println("Please enter in the interest rate, leave the percentage sign (e.g. 3% interest should be entered as 3): ");
        double interestRate=s.nextDouble();
        for(int i=0;i<year;i++){
        principle*=1+(interestRate/100);
        }
         System.out.println("Your final amount is: "+principle);
    }
    
    public double currencyConversion(){
        return 0.0;   
    }
    
    public double tax(){
        return 0.0;   
    }
    public double taxedTotal(){
        return 0.0;   
    }
    public double profit(){
        return 0.0;   
    }
    public double incomeTax(){
        return 0.0;   
    }
    public double netWorth(double [] amounts){
        double temp=0;
        for(double i:amounts){temp+=i;}
        return temp;   
    }
    public double mortgage(double principal, double rate, double payments, double paymentsPerYear){
        return principal*(((rate/paymentsPerYear)*Math.pow(1+(rate/paymentsPerYear),payments))/(Math.pow(1+(rate/paymentsPerYear),payments)-1));   
    }
}
