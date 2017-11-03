/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatzar;
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
    public double netWorth(double [] amounts){
        double temp=0;
        for(double i:amounts){temp+=i;}
        return temp;   
    }
    public double mortgage(double principal, double rate, double payments, double paymentsPerYear){
        return principal*(((rate/paymentsPerYear)*Math.pow(1+(rate/paymentsPerYear),payments))/(Math.pow(1+(rate/paymentsPerYear),payments)-1));   
    }
}