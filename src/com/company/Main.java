package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Main{

    public static void main(String[] args) {
	/* Exercise 7.0:
	(a) create an array dailyAverageTemp
	(b) input temperatures for 7 days (degree F)
	(c) add it to dailyAverageTemp
	(d) print out each daily avg temperature
	(e) print out the weekly average temperature
	//Part 2: Use at least one for-each loop
	(f) convert each temp to celsius
	(g) print out each daily and weekly average in Fahrenheit and Celsius
	 */
     Scanner userInput = new Scanner(System.in);
     DecimalFormat df = new DecimalFormat("#");
     final int MAX_DAYS =7;
     //(a) declare dailyAverageTemp array -- temperature in Fahrenheit
     double[] dailyAverageTemp = new double[MAX_DAYS];
     double[] dailyAvTempCel = new double[MAX_DAYS];
     //double initializer = 0;
     double totalTempF = 0.0;
     double totalTempC = 0.0;
     double avWeeklyTempF;
     double avWeeklyTempC;


    System.out.println("Enter Daily Temperatures in Fahrenheit for " + MAX_DAYS + " days.");
    //part a,b,c,d
        for(int i = 0; i < MAX_DAYS; i++)
        {
            //input days in Fahrenheit
         System.out.print("Day " + (i+1) + ": ");
         dailyAverageTemp[i] = userInput.nextDouble();

         //convert Fahrenheit to Celsius
         dailyAvTempCel[i] =  (5.0/9.0) * (dailyAverageTemp[i]  - 32.0);

         totalTempF = totalTempF + dailyAverageTemp[i];
         totalTempC = totalTempC + dailyAvTempCel[i];
        }
        System.out.println("*********************************Fahrenheit****************************************");

        avWeeklyTempF = totalTempF / dailyAverageTemp.length;

        //print and get the daily average temp in Fahrenheit
        System.out.println("Daily Temperatures in Fahrenheit: ");
        for(double tempF : dailyAverageTemp)
        {
            System.out.print(df.format(tempF) + "; ");

        }

        System.out.println("");
        System.out.println("Average Weekly Temperature in Fahrenheit: " + df.format(avWeeklyTempF));

        System.out.println("*********************************Celsius****************************************");

        //Calculate and print out the Celsius equivalents
        avWeeklyTempC = totalTempC / dailyAvTempCel.length;
        System.out.println("Daily Temperatures in Celsius: ");

        for(double tempC : dailyAvTempCel)
        {
            System.out.print(df.format(tempC) + "; ");
        }

        System.out.println("");
        System.out.println("Average Weekly Temperature in Celsius: " + df.format(avWeeklyTempC));


    }//end main
}
