/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Luis Hernandez
 */

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //initialize tax and county tax
        double tax = 0;
        double county_tax = 0;
        //prompt the user for the order amount
        System.out.print("What is the order amount? ");
        int amount = in.nextInt();
        //call the nextLine() function to input a String next
        in.nextLine();
        //prompt the user for the state they live in
        System.out.print("What state do you live in? ");
        String state = in.nextLine();
        //if the user lives in Wisconsin, add a 5% sales tax and ask them what county they live in
        if(state.equals("Wisconsin")) {
            tax = amount * 0.05;
            System.out.print("What county do you live in? ");
            String county = in.nextLine();
            //if the user lives in Eau Claire County, add an additional 0.5% tax
            if(county.equals("Eau Claire")) {
                county_tax = amount * 0.005;
            }
            //if the user lives in Dunn County, add an additional 0.4% tax
            else if(county.equals("Dunn")) {
                county_tax = amount * 0.004;
            }
        }
        //if the user lives in Illinois, add an 8% sales tax
        else if(state.equals("Illinois")) {
            tax = amount * 0.08;
        }
        //calculate total tax
        double total_tax = tax + county_tax;
        //calculate the total
        double total = total_tax + amount;
        //display the results
        System.out.printf("The tax is $%.2f.%nThe total is $%.2f.", total_tax, total);
    }
}
