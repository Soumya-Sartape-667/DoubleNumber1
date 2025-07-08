package com.dkte;

import java.util.Scanner;


public class program {

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Enter the first number (double):");
		        // Checking if the input is NOT a double OR is an integer
		        if (!sc.hasNextDouble() || sc.hasNextInt()) {
		            System.out.println("Invalid input! Only double values");
		            sc.close();
		            return;
		        }
		        // Reading the first double number from the user
		        double n1 = sc.nextDouble();

		        System.out.println("Enter the second number (double):");
		        if (!sc.hasNextDouble() || sc.hasNextInt()) {
		            System.out.println("Invalid input! Only double values");
		            sc.close();
		            return;
		        }
		        double n2 = sc.nextDouble();//second number check 
		        // Calculating the average of two numbers
		        double average = (n1 + n2) / 2;
		        System.out.println("Average: " + average);

		        sc.close();
		    }
		}