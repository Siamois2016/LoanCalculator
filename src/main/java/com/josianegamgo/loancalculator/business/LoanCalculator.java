
package com.josianegamgo.loancalculator.business;

import com.josianegamgo.loancalculator.beans.Loan;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author j_gamgo
 */
public class LoanCalculator {
   public  LoanCalculator(){
super();
}
   
   public synchronized double calculateLoan(Loan loan) throws IOException{
   double payment;
   int n =loan.getPeriod();
   double rate = loan.getRate();
   double pv =loan.getPv();

   n= n*12;
   rate = rate/12;
   payment = (pv*rate)/(1- (Math.pow((1+rate), -(n/12))));

    return payment;
   }
}
