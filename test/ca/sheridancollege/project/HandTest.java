/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.List;
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
public class HandTest {
    
    public HandTest() {
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
     * Test of mergeHand method, of class Hand.
     */
    @Test
    public void testMergeHand() {
        System.out.println("mergeHand");
        Hand other = null;
        Hand instance = new Hand();
        instance.mergeHand(other);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of take method, of class Hand.
     */
    @Test
    public void testTake() {
        System.out.println("take");
        int numCards = 0;
        Hand instance = new Hand();
        List<Card> expResult = null;
        List<Card> result = instance.take(numCards);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCardToTop method, of class Hand.
     */
    @Test
    public void testAddCardToTop() {
        System.out.println("addCardToTop");
        Card c = null;
        Hand instance = new Hand();
        instance.addCardToTop(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCardsToTop method, of class Hand.
     */
    @Test
    public void testAddCardsToTop() {
        System.out.println("addCardsToTop");
        List<Card> cds = null;
        Hand instance = new Hand();
        instance.addCardsToTop(cds);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCardToBottom method, of class Hand.
     */
    @Test
    public void testAddCardToBottom() {
        System.out.println("addCardToBottom");
        Card c = null;
        Hand instance = new Hand();
        instance.addCardToBottom(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCardFromTop method, of class Hand.
     */
    @Test
    public void testRemoveCardFromTop() {
        System.out.println("removeCardFromTop");
        Hand instance = new Hand();
        Card expResult = null;
        Card result = instance.removeCardFromTop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCardFromBottom method, of class Hand.
     */
    @Test
    public void testRemoveCardFromBottom() {
        System.out.println("removeCardFromBottom");
        Hand instance = new Hand();
        Card expResult = null;
        Card result = instance.removeCardFromBottom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handSize method, of class Hand.
     */
    @Test
    public void testHandSize() {
        System.out.println("handSize");
        Hand instance = new Hand();
        int expResult = 0;
        int result = instance.handSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
