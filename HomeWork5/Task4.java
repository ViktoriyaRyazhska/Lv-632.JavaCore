package com.softserve.javaCore.homework5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Organize entering integers until the first negative number. 
 * Count the product of all entered even numbers.*/

public class Task4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		 System.out.println("¬ведите количество числел ");
		
		 int size = Integer.parseInt(br.readLine()); 							
		    int arr[] = new int[size]; 
		   
		   
		    
		    for (int i = 0; i < size; i++) { 
		    	 System.out.println("¬ведите положетельные числа ");
		    	arr[i] = Integer.parseInt(br.readLine());
		    	if(arr[i]<0) {
		    		System.out.println("вы ввели отрицательное число");
					break; 
				}
		    }
		    	
		    
		    int prodEven = 1;
		    for (int i = 0; i < size; i++) {
		    		if(arr[i]%2==0) {
						 prodEven = prodEven*arr[i]; 
						 
						}
					
		    }
		    System.out.println("product of all entered even numbers "+prodEven);
		    }
}
