/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.cmdline;

import com.mycompany.rockscissorpaper.controller.Choice;
import com.mycompany.rockscissorpaper.controller.Game;
import com.mycompany.rockscissorpaper.model.Player;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ale
 */
public class Play {
    
    public Play() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void play() {
        Game game = new Game("morra");
        
        Player p1 = new Player("human");
        Choice c1 = p1.readChoice();
        
        Player p2 = new Player();
        Choice c2 = p2.randomChoice();
        
        game.whoWin(c1,c2);
    }
}
