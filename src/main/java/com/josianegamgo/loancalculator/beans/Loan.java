/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.josianegamgo.loancalculator.beans;

import java.io.Serializable;

/**
 *
 * @author j_gamgo
 */
public class Loan implements Serializable {
    private double pv;
    private double rate;
    private int period;
    private double pmt;
   
    public Loan(){
    super();
    this.period=0;
    this.pmt=0.0;
    this.rate=0.0;
    this.pv=0.0;
    
    
    }
    public Loan(int period,double rate, double pv){
    this.period=period;
   
    this.rate = rate;
    this.pv = pv;
    
    }

    /**
     * @return the pv
     */
    public double getPv() {
        return pv;
    }

    /**
     * @param pv the pv to set
     */
    public void setPv(double pv) {
        this.pv = pv;
    }

    /**
     * @return the rate
     */
    public double getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    /**
     * @return the period
     */
    public int getPeriod() {
        return period;
    }

    /**
     * @param period the period to set
     */
    public void setPeriod(int period) {
        this.period = period;
    }

    /**
     * @return the pmt
     */
    public double getPmt() {
        return pmt;
    }

    /**
     * @param pmt the pmt to set
     */
    public void setPmt(double pmt) {
        this.pmt = pmt;
    }



    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.getPv()) ^ (Double.doubleToLongBits(this.getPv()) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.getRate()) ^ (Double.doubleToLongBits(this.getRate()) >>> 32));
        hash = 79 * hash + this.getPeriod();
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.getPmt()) ^ (Double.doubleToLongBits(this.getPmt()) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Loan other = (Loan) obj;
        if (Double.doubleToLongBits(this.getPv()) != Double.doubleToLongBits(other.getPv())) {
            return false;
        }
        if (Double.doubleToLongBits(this.getRate()) != Double.doubleToLongBits(other.getRate())) {
            return false;
        }
        if (this.getPeriod() != other.getPeriod()) {
            return false;
        }
        else if (Double.doubleToLongBits(this.getPmt()) != Double.doubleToLongBits(other.getPmt())) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LoanCalculatorBeans{" + "pv=" + pv + ", rate=" + rate + ", period=" + period + ", pmt=" + pmt + '}';
    }
    
    
}
