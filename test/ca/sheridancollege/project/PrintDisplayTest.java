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
public class PrintDisplayTest {
    
    public PrintDisplayTest() {
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
     * Test of openingMessage method, of class PrintDisplay.
     */
    @Test
    public void testOpeningMessage() {
        System.out.println("openingMessage");
        PrintDisplay instance = new PrintDisplay();
        instance.openingMessage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startGameMessage method, of class PrintDisplay.
     */
    @Test
    public void testStartGameMessage() {
        System.out.println("startGameMessage");
        Player player = null;
        PrintDisplay instance = new PrintDisplay();
        instance.startGameMessage(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printRoundHeader method, of class PrintDisplay.
     */
    @Test
    public void testPrintRoundHeader() {
        System.out.println("printRoundHeader");
        Player playerOne = null;
        Player playerTwo = null;
        PrintDisplay instance = new PrintDisplay();
        instance.printRoundHeader(playerOne, playerTwo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of declareRoundWinner method, of class PrintDisplay.
     */
    @Test
    public void testDeclareRoundWinner() {
        System.out.println("declareRoundWinner");
        Player player1 = null;
        Card card1 = null;
        Player player2 = null;
        Card card2 = null;
        String winner = "";
        PrintDisplay instance = new PrintDisplay();
        instance.declareRoundWinner(player1, card1, player2, card2, winner);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of declareWarRound method, of class PrintDisplay.
     */
    @Test
    public void testDeclareWarRound() {
        System.out.println("declareWarRound");
        PrintDisplay instance = new PrintDisplay();
        instance.declareWarRound();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of declareGameWinner method, of class PrintDisplay.
     */
    @Test
    public void testDeclareGameWinner() {
        System.out.println("declareGameWinner");
        Player player = null;
        PrintDisplay instance = new PrintDisplay();
        instance.declareGameWinner(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of declareDraw method, of class PrintDisplay.
     */
    @Test
    public void testDeclareDraw() {
        System.out.println("declareDraw");
        PrintDisplay instance = new PrintDisplay();
        instance.declareDraw();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
