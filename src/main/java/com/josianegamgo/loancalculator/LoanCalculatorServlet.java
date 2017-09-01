/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.josianegamgo.loancalculator;

import com.josianegamgo.loancalculator.beans.Loan;
import com.josianegamgo.loancalculator.business.LoanCalculator;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author j_gamgo
 */

public class LoanCalculatorServlet extends HttpServlet {

 private final String TITLE = "Loan Calculator";
 
 LoanCalculator calculator = new LoanCalculator();
 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String url ="/index.jsp";
        String action =request.getParameter("action") ;
        if(action==null){
        action ="join";
        }
        else{
        switch(action){
            case "join":
                url ="/index.jsp";
                break;
            case "add":
             
            String pv = request.getParameter("pv");
             String rate = request.getParameter("rate");
             String n = request.getParameter("n");
             //create a loan
             Loan loanbeans= new Loan();
              loanbeans.setPeriod(Integer.valueOf(n));
              loanbeans.setRate(Double.valueOf(rate));
              loanbeans.setPv(Double.valueOf(pv));
        String message;
        if ( pv.isEmpty() || rate.isEmpty() || n.isEmpty()) {
                    message = "Please fill out all three text boxes.";
                    url = "/index.jsp";
                }
  
        else {
                    
               message = null;
                    url = "/bye.jsp";
          
                    ServletContext servletcontext = request.getSession().getServletContext();
                    
                    //String realContextPath = servletcontext.getRealPath("/WEB-INF/AllLoans.txt");
                    
            loanbeans.setPmt(calculator.calculateLoan(loanbeans)); 
       
        }
        request.setAttribute("loanbeans", loanbeans);
        request.setAttribute("pv", loanbeans.getPv());
        request.setAttribute("rate", loanbeans.getRate());
        request.setAttribute("n", loanbeans.getPeriod());
        request.setAttribute("pmt", loanbeans.getPmt());
        request.setAttribute("message", message);
            break;
        
        
        }
        getServletContext()
                
                .getRequestDispatcher(url)
                .forward(request, response); 
        
        }
        
             
        
    
    }


}
