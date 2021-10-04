package com.softserve.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW1T3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter standard units per minute for first call c1: ");
		int c1 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter standard units per minute for second call c2: ");
		int c2 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter standard units per minute for third call c3: ");
		int c3 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter minites for first call t1 ");
		int t1 = Integer.parseInt(br.readLine());
		int cost1call = c1*t1;
		
		System.out.println("Enter minites for first call t2 ");
		int t2 = Integer.parseInt(br.readLine());
		int cost2call = c2*t2;
		
		System.out.println("Enter minites for first call t3 ");
		int t3 = Integer.parseInt(br.readLine());
		int cost3call = c3*t3;
		
		int sumallcalls = cost1call + cost2call + cost3call;
		
		System.out.println("First call price: "+cost1call);
		System.out.println("Second call price: "+cost2call);
		System.out.println("Third call price: "+cost3call);
		
		System.out.println("All calls price: "+sumallcalls);
		}

}
