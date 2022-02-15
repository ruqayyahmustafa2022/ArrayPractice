package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Exercise 7.0:
	(a) create an array dailyAverageTemp
	(b) input temperatures for 7 days (degree F)
	(c) add it to dailyAverageTemp
	(d) print out each daily avg temperature
	(e) print out the weekly average temperature
	 */
     Scanner userInput = new Scanner(System.in);
     double[] dailyAverageTemp = new double[7];



    //part a,b,c,d
     for(int i = 0; i < dailyAverageTemp.length; i++)
     {
         double totalTemp;
         System.out.println("Enter the daily avg temp for Day " + (i+1) + ": ");
         dailyAverageTemp[i] = userInput.nextDouble();

     }


     for(int i = 0; i < dailyAverageTemp.length; i++)
     {
         System.out.println("The temperature for each day: " + dailyAverageTemp[i]);

     }

     //part e: calculate the weekly average temperature
     double weeklyAvTemp = (dailyAverageTemp[0] + dailyAverageTemp[1] + dailyAverageTemp[2] +dailyAverageTemp[3]
                +dailyAverageTemp[4] +dailyAverageTemp[5] +dailyAverageTemp[6]) / dailyAverageTemp.length;

     System.out.println("Weekly Average Temperature: " + weeklyAvTemp);



    }//end main
}
