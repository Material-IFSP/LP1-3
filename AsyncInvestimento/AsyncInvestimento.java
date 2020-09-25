/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author renat
 */
public class AsyncInvestimento {

    public static void main(String[] args) {
        // TODO code application logic here
              
        // System.out.println("asdasd");

        //Dividend Yield
        double divPorAcao; 
        double precoPorAcao; 
        double LPA;
        String resultado;
        
        System.out.println("\n\n ---------------------------------// AULA ASSINCRONA INVESTIMENTO 31/08 //--------------------------------");
        System.out.println("Valores baseados no dia 07.09");

        /**Calcular ENAT3 
            *
            * Site pego como base https://statusinvest.com.br/acoes/enat3. 
            * Preço da ação usado como base é do dia 07.09.2020;
            *             
         */
                
            /**Dividend Yield */           
            divPorAcao = 1.1427;
            precoPorAcao = 11.45;

            LPA = 1.31;
            
            resultado = String.format("%.2f", ((divPorAcao / precoPorAcao ) * 100));
            System.out.println("ENAT3 Dividend Yield: " + resultado);
            
            /*
            *P/L 
            * LPA pego do site de referencia acima citado.
            */

            resultado = String.format("%.2f", (precoPorAcao / LPA));
            System.out.println("ENAT3 P/L: " + resultado);

            /*
            *P/VP
            * VPO = Patrimonio liquido(2.910.699.000)/ Numero de papeis(265.806.905) = 10.95
            */
            resultado = String.format("%.2f", (precoPorAcao / 10.95));
            System.out.println("ENAT3 P/VP: " + resultado);
            System.out.println("---------------------------------//----------------------------------------------------------------");
        

        /**Calcular ITSA4 
            *
            * Site pego como base https://statusinvest.com.br/acoes/itsa4.
            * Preço da ação usado como base é do dia 07.09.2020;
            *             
        */
        
        
       
            /**Dividend Yield */
            divPorAcao = 0.5494;
            precoPorAcao = 9.77;

            LPA = 0.83;
            
            resultado = String.format("%.2f", ((divPorAcao / precoPorAcao ) * 100));
            System.out.println(" ITSA4 Dividend Yield: " + resultado);
            
            /*
            *P/L 
            * LPA pego do site de referencia acima citado.
            */
            resultado = String.format("%.2f", (precoPorAcao / LPA));
            System.out.println(" ITSA4 P/L: " + resultado);

            /*
            *P/VP
            * VPO = Patrimonio liquido(52.896.000.000)/ Numero de papeis(8.410.814.930) = 10.95
            */
            resultado = String.format("%.2f", (precoPorAcao / 6.29));
            System.out.println(" ITSA4 P/VP: " + resultado);
            System.out.println("---------------------------------//----------------------------------------------------------------");
        

        /**Calcular WEGE3 
            *
            * Site pego como base https://statusinvest.com.br/acoes/wege3. 
            * Preço da ação usado como base é do dia 07.09.2020;
            *             
        */
        
            /**Dividend Yield */
          
            divPorAcao = 0.4422;
            precoPorAcao = 64.49;

            LPA = 0.89;
            
            resultado = String.format("%.2f", ((divPorAcao / precoPorAcao ) * 100));
            System.out.println("WEGE3 Dividend Yield: " + resultado);
            
            /*
            *P/L 
            * LPA pego do site de referencia acima citado.
            */

            resultado = String.format("%.2f", (precoPorAcao / LPA));
            System.out.println("WEGE3 P/L: " + resultado);

            /*
            *P/VP
            * VPO = Patrimonio liquido(10.362.308.000)/ Numero de papeis(2.098.658.999) = 4.94
            */
            resultado = String.format("%.2f", (precoPorAcao / 4.94));
            System.out.println("WEGE3 P/VP: " + resultado);
            System.out.println(" ---------------------------------//----------------------------------------------------------------");
            System.out.println("Valores baseados no dia 07.09");
    }
}
    
    

