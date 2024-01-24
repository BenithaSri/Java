/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.spring24.cs44542.sec03.classes;
import java.util.Scanner;
/**
 *
 * @author S569105
 */

public class BookDriver {
    public static void main(String[]  args){
    Scanner bookScanner = new Scanner(System.in);
    //title
    System.out.println("Enter the title of the book:");
    String t = bookScanner.nextLine();
    //author
    System.out.println("Enter the author of the book:");
    String a = bookScanner.nextLine();
    //price
    System.out.println("Enter the price of the book:");
    double p = bookScanner.nextDouble();
    //tax
    System.out.println("Enter the tax percentage of the book:");
    double T = bookScanner.nextDouble();
    
    //book1 Object
    
    Book book1 = new Book(t,a,p,T);
    System.out.println(book1.toString());
    System.out.println("The total price of the book:" + book1.calcTotalPrice());
    System.out.println("The final price of the book:" + book1.calcFinalPrice());
    
    //book2 Object
    
    Book book2 = new Book();
    System.out.println(book2.toString());
    System.out.println("The total price of the book:" + book1.calcTotalPrice());
    System.out.println("The final price of the book:" + book1.calcFinalPrice());
    
    
    book2.setTitle("Effective Java");
    book2.setAuthor("Joshua Bloch");
    book2.setPrice(250);
    book2.setTaxPercentage(8.11);
    System.out.println(book2.toString());
    System.out.println("The total price of the book:" + book1.calcTotalPrice());
    System.out.println("The final price of the book:" + book1.calcFinalPrice());
    

    }
    
    
}
