/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.year1progicetask.Customer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author uvekt
 */
public class CustomerTest {
    
   @Test
    void testInitialPoints() {
        Customer c = new Customer("Taelo");
        assertEquals(0, c.getPoints());
    }

    @Test
    void testAddPoints() {
        Customer c = new Customer("Taelo");
        c.addPoints();
        assertEquals(10, c.getPoints());
    }

    @Test
    void testRedeemSuccess() {
        Customer c = new Customer("Taelo");

        // Add 50 points
        for (int i = 0; i < 5; i++) {
            c.addPoints();
        }

        c.redeemPoints();
        assertEquals(0, c.getPoints());
    }

    @Test
    void testRedeemFailure() {
        Customer c = new Customer("Taelo");

        c.addPoints(); // only 10 points
        c.redeemPoints();

        assertEquals(10, c.getPoints()); // should remain unchanged
    }
}
    

