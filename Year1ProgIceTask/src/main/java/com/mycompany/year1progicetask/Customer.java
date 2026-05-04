/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.year1progicetask;

/**
 *
 * @author uvekt
 */
public class Customer {
    private String name;
    private int points;

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.points = 0; // starts at 0
    }

    // Add points
    public void addPoints() {
        points += 10;
        System.out.println("10 Points added");
    }

    // Redeem points
    public void redeemPoints() {
        if (points >= 50) {
            points -= 50;
            System.out.println("Reward redeemed! Free coffee ☕");
        } else {
            System.out.println("Insufficient Points");
        }
    }

    // Display status
    public void displayStatus() {
        System.out.println("Member information:");
        System.out.println("Name: " + name);
        System.out.println("Points: " + points);
    }

    // Getter for testing
    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
}
}
