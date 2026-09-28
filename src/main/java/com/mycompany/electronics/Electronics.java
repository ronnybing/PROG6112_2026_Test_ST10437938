/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.electronics;

/**
 *
 * @author emeris
 */
import java.util.Scanner;

public class Electronics {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //1d array to store cities 
        String[] cities = {"Cape Town", "Port Elizabeth","Pretoria"};
        //2d arrays to store sales
        int[][] sales = new int [3][3];
        
         for (int i = 0; i < cities.length; i++) {
           System.out.print("Enter the number of PS5 sales for " + cities[i] + ": ");
           sales[i][0] = input.nextInt();


           System.out.print("Enter the number of XBOX sales for " + cities[i] + ": ");
           sales[i][1] = input.nextInt();
           
           
           System.out.print("Enter the number of SWITCH sales for " + cities[i] + ": ");
           sales[i][1] = input.nextInt();
       }

        
        
        // print sales report
        System.out.println("-----------------------------");
                 System.out.println("Sales Report");
         System.out.println("-----------------------------");  
                 System.out.printf("%-20s %-15s %-15s\n","","PS5","XBOX","SWITCH");
                 
         //Display the table rows
         for (int i = 0; i < cities.length; i++){
             
             System.out.printf("%-20s %-15d %-15d\n",cities[i],sales[i][0],sales[i][1]);
        
         }
         System.out.println("--------------------------------------------------");
              System.out.println("ROAD ACCIDENT TOTALS FOR EACH CITY");
         System.out.println("--------------------------------------------------");
         
          int maxTotal = -1;
         String cityWithMostSales = "";
         
         
          for (int i = 0; i < cities.length; i++) {
           int totalCitySales = sales[i ][0] + sales[i][1];
           System.out.printf("%-20s %-15d\n", cities[i], totalCitySales);


           // Track the city with the most sales
           if (totalCitySales > maxTotal) {
               maxTotal = totalCitySales;
               cityWithMostSales = cities[i];
           }
       }
          
        System.out.println("--------------------------------------------------");
       System.out.println("CITY WITH THE MOST Sales: " + cityWithMostSales);
       System.out.println("--------------------------------------------------");


       input.close();
   }
}
  



         
             
         
        
