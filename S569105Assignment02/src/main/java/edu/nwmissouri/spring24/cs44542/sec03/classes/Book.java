/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.spring24.cs44542.sec03.classes;

/**
 *Class: 44542-03 Object-Oriented Programming
 * 
 * @author Benitha Sri Panchagiri
 * Description: Making sure everything works
 * Due: 01/25/2024
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student, internet, or any other source.
 * I will not share my source code with anyone under any circumstances.
 */

public class Book {
    //declaring attributes
    
    private String title;
    private String author;
    private double price;
    private double taxPercentage;
    final static double DISCOUNT = 10.0;
    private double totalPrice;
    private double finalPrice;
    
    //CONSTRUCTORS 
    // With parameters
    
    public Book(String title, String author, double price, double taxPercentage){
        
        this.author = author;
        this.title = title;
        this.price = price;
        this.taxPercentage = taxPercentage;
        
       }
    //no argument constructor
    public Book(){
        this.author = "unkown";
        this.title = "unknown";
        this.price = 0.0;
        this.taxPercentage = 0.0;
    }
    
    //Methods
    //Getter and Setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }
    
    
    public  double calcTotalPrice(){
         this.totalPrice = price + (price * taxPercentage/100);
       return totalPrice; 
    }
    
    public double calcFinalPrice(){
         this.finalPrice = totalPrice - (totalPrice*DISCOUNT/100);
        return finalPrice;
    }

    @Override
    public String toString() {
        return "Title of the book:" + title + "\n"+ 
                "Author of the book:"+author+ "\n"+
                "Price of the book:"+ price+"\n"+
                "Tax Percentage:" + taxPercentage+"\n"+
                "Discount:"+DISCOUNT+"\n"+
                "Total Price of the book including the tax:"+taxPercentage+"\n"+
                "Final price of the book after discount:"+finalPrice+"\n";
                
                }
    
}
   
    


 

