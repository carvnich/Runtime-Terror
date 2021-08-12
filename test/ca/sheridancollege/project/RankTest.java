/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nick
 */
public class RankTest {
    
    public RankTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of values method, of class Rank.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Rank[] expResult = null;
        Rank[] result = Rank.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class Rank.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "";
        Rank expResult = null;
        Rank result = Rank.valueOf(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRankName method, of class Rank.
     */
    @Test
    public void testGetRankName() {
        System.out.println("getRankName");
        Rank instance = null;
        String expResult = "";
        String result = instance.getRankName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPointValue method, of class Rank.
     */
    @Test
    public void testGetPointValue() {
        System.out.println("getPointValue");
        Rank instance = null;
        int expResult = 0;
        int result = instance.getPointValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Rank.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Rank instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
