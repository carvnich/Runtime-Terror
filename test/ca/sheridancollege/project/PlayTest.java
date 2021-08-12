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
public class PlayTest {
    
    public PlayTest() {
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
     * Test of startGame method, of class Play.
     */
    @Test
    public void testStartGame() {
        System.out.println("startGame");
        Play instance = new Play();
        instance.startGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dealCards method, of class Play.
     */
    @Test
    public void testDealCards() {
        System.out.println("dealCards");
        Hand hand = null;
        Play instance = new Play();
        instance.dealCards(hand);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of battle method, of class Play.
     */
    @Test
    public void testBattle() {
        System.out.println("battle");
        Player playerOne = null;
        Player playerTwo = null;
        Hand pot = null;
        Play instance = new Play();
        boolean expResult = false;
        boolean result = instance.battle(playerOne, playerTwo, pot);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
