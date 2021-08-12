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
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
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
     * Test of Shuffle method, of class GroupOfCards.
     */
    @Test
    public void testShuffle() {
        System.out.println("Shuffle");
        GroupOfCards instance = new GroupOfCards();
        instance.Shuffle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCards method, of class GroupOfCards.
     */
    @Test
    public void testGetCards() {
        System.out.println("getCards");
        GroupOfCards instance = new GroupOfCards();
        List<Card> expResult = null;
        List<Card> result = instance.getCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardsCount method, of class GroupOfCards.
     */
    @Test
    public void testGetCardsCount() {
        System.out.println("getCardsCount");
        GroupOfCards instance = new GroupOfCards();
        int expResult = 0;
        int result = instance.getCardsCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dealCard method, of class GroupOfCards.
     */
    @Test
    public void testDealCard() {
        System.out.println("dealCard");
        GroupOfCards instance = new GroupOfCards();
        Card expResult = null;
        Card result = instance.dealCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCard method, of class GroupOfCards.
     */
    @Test
    public void testAddCard() {
        System.out.println("addCard");
        Card c = null;
        GroupOfCards instance = new GroupOfCards();
        instance.addCard(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class GroupOfCards.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        GroupOfCards instance = new GroupOfCards();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
