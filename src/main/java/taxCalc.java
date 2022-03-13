package main.java;
import java.util.Scanner;

// @author larsencs
public class taxCalc {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tax = .09, fee = 1.00;
        
        System.out.println("Enter the purchase amount: ");
        double amount = scan.nextDouble();
        double total = amount + (amount * tax) + fee;
        
        System.out.println("Purchase amount: $" + amount);
        System.out.println("Sales tax: " + tax * 100 + "%");
        System.out.println("Delivery Fee: $" + fee);
        System.out.println("total cost: &" + total);
    }
    
}