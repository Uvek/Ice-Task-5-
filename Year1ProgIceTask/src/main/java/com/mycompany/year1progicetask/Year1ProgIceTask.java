/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.year1progicetask;

import java.util.Scanner;

/**
 *
 * @author uvekt
 */
public class Year1ProgIceTask {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        Customer customer = new Customer(name);

        int choice;

        do {
            System.out.println("\nJava Bean Café");
            System.out.println("1. Buy Coffee (+10 pts)");
            System.out.println("2. Redeem Reward (50 pts)");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    customer.addPoints();
                    break;

                case 2:
                    customer.redeemPoints();
                    break;

                case 3:
                    customer.displayStatus();
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }

        } while (choice != 4);

        input.close();
    }
}
    

