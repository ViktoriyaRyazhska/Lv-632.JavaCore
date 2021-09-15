package com.edu;
import java.util.Scanner;
import java.io.IOException;
import java.lang.Math;


public class Intro2{
	 
	public static void main(String[] args) throws IOException {
		  
		  Scanner input = new Scanner(System.in);

	//Task1
	//Flower bed is shaped like a circle. Calculate the perimeter and area by entering the radius. Output obtained results.
		
		System.out.println("Task 1");
		
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        double perimeter=2*Math.PI*radius;
        double area =2*Math.PI*Math.pow(radius,2);

        System.out.println("Flower bed perimeter = " + perimeter);
        System.out.println("Flower bed area = " + area);

    
    //Task2	  
    //Define String variables name and address. Output question "What is your name?" Read the value name and output next question: “Where are you live, (name)?". Read address and write whole information.
      
      System.out.println("");
      System.out.println("Task 2");

           
      System.out.println("What is your name?");
      String  name = input.next();
      System.out.println("Where do you live, "+name+"?");
      String address = input.next();
      System.out.println("Yua are "+name+" and your address is "+address+".");  
	
	//Task3	  
    //Phone calls from three different countries are с1, с2 and с3 standard units per minute. Talks continued t1, t2 and t3 minutes. How much computer will count for each call separately and all talk together? Input all source data from console, make calculations and output to the screen.
      System.out.println("");
      System.out.println("Task 3");
      
      System.out.print("C units for country1 are entered here:");
      double  c1 = input.nextDouble();
      System.out.print("T minutes  for country1 are entered here:");
      int t1 = input.nextInt();
      System.out.print("C units for country2 are entered here:");    
      double  c2 = input.nextDouble();
      System.out.print("T minutes  for country2 are entered here:");
      int t2 = input.nextInt();
      System.out.print("C units for country3 are entered here:");    
      double  c3 = input.nextDouble();
      System.out.print("T minutes  for country3 are entered here:");
      int t3 = input.nextInt();
      
      //units are the same for 3 countries according to the task and I assume that calls are rounded to minutes
      double Country1CallCost= c1*t1;
      double Country2CallCost=c2*t2;
      double Country3CallCost=c3*t3;
      double TotalCountryCost =Country1CallCost+Country2CallCost+Country3CallCost;
      System.out.println("Country 1 Phone Call Cost is "+Country1CallCost+".");  
      System.out.println("Country 3 Phone Call Cost is "+Country2CallCost+".");  
      System.out.println("Country 3 Phone Call Cost is "+Country3CallCost+".");  
      System.out.println("All Countries Phone Calls cost "+TotalCountryCost+"."); 
      
      input.close();
	  }


}
