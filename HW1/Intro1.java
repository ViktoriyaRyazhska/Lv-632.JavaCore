package com.edu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Intro1 {
  public static void main(String[] args) throws IOException {

//Task1
int a=5;
int b=7;
System.out.println("Task1");
System.out.println("a + b = " + (a+b));
System.out.println("a - b = " + (a-b));
System.out.println("a * b = " + (a*b));
System.out.println("a / b =  " +(a/b));


System.out.println("");
//Task2

System.out.println("Task2");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("How are you?");
String answer = br.readLine();
System.out.println("You are " + answer);


  }
}

