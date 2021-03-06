/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatzar;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Vasily Kapustin
 */
public class FinancialCalculator {
    public double [] currencyValue; 
    public double tax;
    private static Scanner in = new Scanner(System.in);
    
    public void menu(){
        System.out.println("Choose what you want to do:");
        System.out.println("1.Simple Interest");
        System.out.println("2.Compound Interest");
        System.out.println("3.Currency Conversion");
        System.out.println("4.Tax");
        System.out.println("5.Total Tax");
        System.out.println("6.Profit Margins");
        System.out.println("7.Federal Income Tax");
        System.out.println("8.Net Worth");
        System.out.println("9.Mortgage");
        
        switch(in.nextInt()){
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
                    profitMargins();
                break;
                case 7:
                    federalIncomeTax();
                break;
                case 8:
                    netWorth();
                default:
                    mortgage();
                    break;
        }
    }
    public void simpleInterest(){
        System.out.println("Please enter in the principle amount: ");
        double principle=in.nextDouble();
        System.out.println("Please enter in the number of years:");
        double year=in.nextDouble();
        System.out.println("Please enter in the interest rate, leave the percentage sign (e.g. 3% interest should be entered as 3): ");
        double interestRate=in.nextDouble();
        for(int i=0;i<year;i++){
            principle+=principle*interestRate/100;
        }
        System.out.println("Your final amount is: "+principle);
    }
    
    public void compoundInterest(){
        System.out.println("Please enter in the principle amount: ");
        double principle=in.nextDouble();
        System.out.println("Please enter in the number of years:");
        double year=in.nextDouble();
        System.out.println("Please enter in the interest rate, leave the percentage sign (e.g. 3% interest should be entered as 3): ");
        double interestRate=in.nextDouble();
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
    
    public void profitMargins() {
        System.out.print("Enter your sales: ");
        double sales = in.nextDouble();
        System.out.print("\nEnter your cost of goods/services sold: ");
        double costs = in.nextDouble();
        
        System.out.print("\nYour profit margins are " + (sales - costs) / sales * 100 + "%.");
        
    }
    
    public void federalIncomeTax() {
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.print("Enter your income: ");
        double income = in.nextDouble();
        double totalTax = 0;
        
        final double[] federalRates = {0.15, 0.205, 0.26, 0.29, 0.33};
        final double[] federalBrackets = {45916, 45915, 50522, 60477};
        
        for (int i = 0; i < federalBrackets.length; i++) {          
            if (income > 0) {
                if (income > federalBrackets[i]) {
                    totalTax += federalBrackets[i] * federalRates[i];
                    income -= federalBrackets[i];
                } else {
                    totalTax += income * federalRates[i];
                    income = 0;
                    break;
                }
            }
        }
        totalTax += income * 0.33;

        System.out.print("\nYou will pay a total of $" + df.format(totalTax) + " in income tax to the federal governemnt.");
    }
    
    public void netWorth(){ 
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
        System.out.println("Please input the principal amount of your mortgage");
        double principal = in.nextDouble();
        System.out.println("Please input the rate of your mortgage");
        double rate = in.nextDouble();
        System.out.println("Please input the amount of payements the payout is expected in");
        double payments = in.nextDouble();
        System.out.println("Please input the frequency of the payments");
        double paymentsPerYear = in.nextDouble();
        double pay = principal*(((rate/paymentsPerYear)*Math.pow(1+(rate/paymentsPerYear),payments))/(Math.pow(1+(rate/paymentsPerYear),payments)-1));   
        System.out.println("The required amount to pay per months is " + pay);
    
    
    }
}
