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
public class CardTest {

    public CardTest() {
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
     * Test of getSuit method, of class Card.
     */
    @Test
    public void testGetSuit() {
        System.out.println("getSuit");
        Card instance = null;
        Suit expResult = null;
        Suit result = instance.getSuit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSuitLetter method, of class Card.
     */
    @Test
    public void testGetSuitLetter() {
        System.out.println("getSuitLetter");
        Card instance = null;
        String expResult = "";
        String result = instance.getSuitLetter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRank method, of class Card.
     */
    @Test
    public void testGetRank() {
        System.out.println("getRank");
        Card instance = null;
        Rank expResult = null;
        Rank result = instance.getRank();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRankLetter method, of class Card.
     */
    @Test
    public void testGetRankLetter() {
        System.out.println("getRankLetter");
        Card instance = null;
        String expResult = "";
        String result = instance.getRankLetter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardPoints method, of class Card.
     */
    @Test
    public void testGetCardPoints() {
        System.out.println("getCardPoints");
        Card instance = null;
        Integer expResult = null;
        Integer result = instance.getCardPoints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCard method, of class Card.
     */
    @Test
    public void testGetCard() {
        System.out.println("getCard");
        Card instance = null;
        String expResult = "";
        String result = instance.getCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Card.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Card other = null;
        Card instance = null;
        int expResult = 0;
        int result = instance.compareTo(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSameSuit method, of class Card.
     */
    @Test
    public void testIsSameSuit() {
        System.out.println("isSameSuit");
        Card other = null;
        Card instance = null;
        boolean expResult = false;
        boolean result = instance.isSameSuit(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSameRank method, of class Card.
     */
    @Test
    public void testIsSameRank() {
        System.out.println("isSameRank");
        Card other = null;
        Card instance = null;
        boolean expResult = false;
        boolean result = instance.isSameRank(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Card.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Card instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Card instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
