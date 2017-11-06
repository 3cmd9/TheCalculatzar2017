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
    
    public double simpleInterest(double principle, int year,double interestRate){
        for(int i=0;i<year;i++){
        principle+=principle*interestRate/100;
        }
        return principle;
    }
    
    public double compoundInterest(double principle, int year,double interestRate){
        for(int i=0;i<year;i++){
        principle*=1+(interestRate/100);
        }
        return principle;
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
    public void netWorth(){
        Scanner in= new Scanner(System.in); 
        System.out.println("Please input the values of your individual assests");
        String str = in.nextLine();
        double temp=0;
        while(!str.equals("END")){
            try{
                temp+= Double.parseDouble(str);
            }catch(NumberFormatException nfe){
                System.out.println("Please print a number or END to stop");
            }
            str = in.nextLine();
        }
        
        System.out.println("You net worth is "+temp);
    }
    public void mortgage(){
        Scanner in= new Scanner(System.in);
        System.out.println("Please input the principal amount of your mortgage");
        double principal = in.nextDouble();
        System.out.println("Please input the rate of your mortgage");
        double rate = in.nextDouble();
        System.out.println("Please input the amount of payements the payout is expected in");
        double payments = in.nextDouble();
        System.out.println("Please input the frequency of the payments");
        double paymentsPerYear = in.nextDouble();
        double pay = principal*(((rate/paymentsPerYear)*Math.pow(1+(rate/paymentsPerYear),payments))/(Math.pow(1+(rate/paymentsPerYear),payments)-1));   
        System.out.println("The amount needed to pay per months is " + pay);
    
    
    }
}
