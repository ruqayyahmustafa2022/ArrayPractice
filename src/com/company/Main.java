package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Exercise 7.0:
	(a) create an array dailyAverageTemp
	(b) input temperatures for 7 days (degree F)
	(c) add it to dailyAverageTemp
	(d) print out each daily avg temperature
	 */
     Scanner userInput = new Scanner(System.in);
     double[] dailyAverageTemp = new double[7];




     for(int i = 0; i < dailyAverageTemp.length; i++)
     {
         double totalTemp;
         System.out.println("Enter the daily avg temp for Day " + (i+1) + ": ");
         dailyAverageTemp[i] = userInput.nextDouble();

     }



    }//end main
}
