/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.spring24.cs44542.sec03.objects;

/**
 * Class : 44542 -03 Object-Oriented Programming
 * @author Benitha Sri Panchagiri
 * Description:Making sure everything is working.
 * Due: 01/17/2024
 * I pledge that I have completed the programming assignment independently
 * I have not copied the code from a student, internet, or any other source.
 * I will not share my source code with anyone under any circumstances
 * 
 */

import java.util.Random;
import java.util.*;

public class StringsAndNumbers {
    
     public static void main(String[] args) { 
      
         System.out.println("*******************STRINGCLASS*********************");
         //Initialization and Basic Operations
         
      String stringExample = "Working with String Methods in Java!";
     
     System.out.println("The string is:" + stringExample);
     System.out.println("The length of the string is:" + stringExample.length());
     System.out.println("The character at 5th index of the string is:" + stringExample.charAt(5));
     System.out.println("The substring of 11th and 17th index of the string is:" + stringExample.substring(11 , 17));
     
     //Substring and Comparison
    if (stringExample.contains("Methods"))
        System.out.println("The substring Methods is present in the string");
    else
        System.out.println("The substring Methods is not present in the string");
    
    //String Modification and Case Conversion
      String Firstname = "Benitha Sri";
      String Lastname = "Panchagiri";
      String Fullname = Firstname+"_"+Lastname;
      
      System.out.println(Firstname);
      System.out.println(Firstname.toLowerCase());
      System.out.println(Firstname.toUpperCase());
      
      //Manipulation and Replacement:
      String simpleText = "There are many String methods in Java!";
      System.out.println(simpleText.replace("many", "various"));
      
      //Searching and Trimming
      String searchText = "  Java is Object-Oriented Programming language. Java is high level robust and secure programming language";
      System.out.println("The index of second occurence of JAVA is"+ searchText.indexOf("Java", searchText.indexOf("Java"+ 2)));
      System.out.println("The string after trimming spaces:" + searchText.trim());
      
      
      //Equality and Comparison
      String messageA = "hello";
      String messageB = "HELLO";
      //ignoring case sensitivity
      if (messageA.equalsIgnoreCase(messageB))
          System.out.println("The result of comparing messageA and messageB ignoring case sensitivity is:false");
      else
          System.out.println("The result of comparing messageA and messageB ignoring case sensitivity is:true");
      
      //Considering Case Sensitivity
      if (messageA.equals(messageB))
          System.out.println("The result of comparing messageA and messageB ignoring case sensitivity is:False");
      else
          System.out.println("The result of comparing messageA and messageB ignoring case sensitivity is:true");
      
      //Joining
      System.out.println(Firstname+"_"+Lastname);
      
      
      //RANDOM CLASS
      System.out.println("*****************RANDOMECLASS*************************");
      
      Random Team2 = new Random();
      int player1 = Team2.nextInt(30-21+1)+21;
      int player2 = Team2.nextInt(30-21+1)+21;
      
      System.out.println(player1+player2);
      
      System.out.println("Random values between 0.0 and 1.0 with seed value of 20");
      Random ran1 = new Random(20);
        for(int i=0;i<5;i++){
            System.out.println(ran1.nextFloat());
        }
        
        System.out.println("Random values between 0.0 and 1.0 with no seed value");
         Random ran2 = new Random();
        for(int i=0;i<5;i++){
            System.out.println(ran2.nextFloat());
        }
      
      System.out.println("Haven't got the same result eachtime when no seed is provided ");
      
      //MATH CLASS
      
      System.out.println("*****************MATHCLASS*************************");
      
      //absoulte difference
      int a = -20;
      int b = 15;
      int absoultediff = Math.abs(a-b);
      
      System.out.println("The absoule difference of -20 and 15 is:" + absoultediff);
              
      //rounding off
      float c = (float) 14.6;
      float d = (float) 3.8;
      float solution = (float) c*d;
      float round = (float) Math.round(solution);
      
      System.out.println("The round of value of 14.6* 3.8 is :" + round);
      
      //Computing Floor value
       
      float e = (float) 29.7;
      float f = (float) 4.2;
      float floor = (float) Math.floor(e/f);
      
      System.out.println("The floor value of (29.7/4.2) is:" + floor);
      
      
      //Sqaure root of sums of squares
     
      int v = 10;
      double I = Math.pow(v, 2);
      int j = 20;
      double J = Math.pow(j,2);
      
      double sum = I+J;
      
      System.out.println("The sqaureroot of sum of squares of 10 and 20 is:" + Math.sqrt(sum));
      
      //log2(256)
      
      int log = (int) (Math.log(256)/Math.log(2));
      System.out.println("The log base 2 of 256 is:" + log);
      
      //minimum value in array list
       ArrayList<Integer> list = new ArrayList<>(); 
       list.add(-5);
       list.add(-10);
       list.add(0);
       list.add(15);
       list.add(8);
       
       int min = list.get(0);
       int n = list.size();
       
       for (int l =0; l<n; l++){
           if(list.get(l)<min){
               min=list.get(l);
           }
       }
       
       System.out.println("The minimum value among -5,-10,0,15,8 is:" + min );
       
       //max value between the product of 7 and 9 and the quotient of 40 divided by 5
       
       int x = 7;
       int y = 9;
       int product = x*y;
       
       int dividend = 40;
       int divisor = 5;
       int quotient = dividend / divisor;
       
       System.out.println("The maximum value between the product of 7 and 9 and the quotient of 40\n" +
       "divided by 5 is :" + Math.max(product, quotient));
       
       //sin and cos
       double S = 30;
       double C = 60;
       
       double A = Math.toRadians(S);
       double B = Math.toRadians(C);
       
       double sin = Math.sin(A);
       double cos = Math.cos(B);
       
       double answer = sin * cos;
       System.out.println("The product sine of 30 degrees and the cosine of 60 degrees is:"+ answer);
      
       //tan
       
       double t = 45;
       
       double T = Math.toRadians(45);
       double tan = Math.tan(T-A);
       
       System.out.println("The  tangent of the difference between 45 and 30 degrees is:" + tan );
      
     // expression |3-5|+25-7∗2/2
     
       double result = Math.abs(3-5)+ Math.sqrt(25)-7*2/2;
       System.out.println("The result of the expression |3-5|+25-7∗2/2 is:" + result);
       
     //Bonus questions
     System.out.println("********************BONUSQUESTIONS*************************");
     System.out.println("Both equals() and equalsIgnoreCase() are used to compare two strings. equals() considers the case of the string, wherer as equalsIgnoreCase() ignores the case of the strings.");
     System.out.println("Seeding is generally a starting point for the random generator to start");
     System.out.println("java.lang.Math class is used to access methods in Math class. It has methods to perform mathematical operations like squareroot,logarithums, etc.. Example : Math.sqrt() is used to check sqaure root of a number ");
    }

    
 }
