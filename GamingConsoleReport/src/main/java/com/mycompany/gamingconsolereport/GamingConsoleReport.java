/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsolereport;

/**
 *
 * @author Student
 */
public class GamingConsoleReport {

    public static void main(String[] args) {
        //The single dimension array for the cities
       String cities = {"Cape Town", "Port Elizabeth", "Pretoria"}
               
       //The single dimension array for the console types
       String consoles = {"PS5", "XBOX", "SWITCH"}    
               
       //The two dimensional array for the amount of sales
       int [] sales = {
           {"1000", "2000", "3000"}, //Cape Town
           {"2000", "3000", "4000", //Port Elizabeth
          {"1500", "1100", "1200",//Pretoria
       };
       //Array to store tota per city
       int[][] totalPerCity = new int[3]
               
      //Calculate totals and finds the city with most sales
               int maxSales = 0;
               String topCity = "";
               
      System.out.println();
      System.out.println("Gaming console report");
      System.out.println();
      
      //Loop through 2D array
      for(int i = 0; i < cities.length; i++){
          int cityTotal = 0;
          for (int j = 0; < sales[i].length; j++) {
            cityTotal +=sales[i][j]
            }
          
          totalPerCity[i] = cityTotal;
          
         //Checking for max
          if (cityTotal > maxSales);{
              maxSales = cityTotal;
              topcity = cities[i]
            }
          
          
          }
      }
      }
      
    }
}
