/*
 * Copyright © 2018 Merck Sharp & Dohme Corp., a subsidiary of Merck & Co., Inc.
 * All rights reserved.
 */
package com.merck.fun.life;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.io.InputStreamReader;
import org.junit.Test;

// Refer to: https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life
public class LifeBoardTest {

    @Test
    public void beehiveIsSelfParentConfiguration() throws Exception {
        InputStream is = getClass().getResourceAsStream("/beehive.txt");

        LifeBoard board = LifeBoard.fromReader(new InputStreamReader(is));

        System.out.println(board);

        board.nextState();

        assertTrue(board.isAlive(10, 2));
        assertTrue(board.isAlive(11, 2));

        assertTrue(board.isAlive(10, 4));
        assertTrue(board.isAlive(11, 4));

        assertTrue(board.isAlive(9, 3));
        assertTrue(board.isAlive(12, 3));
    }

    @Test
    public void spaceshipMovesInLeftBottomDirectionAfter4Iterations() throws Exception {
        InputStream is = getClass().getResourceAsStream("/spaceship.txt");

        LifeBoard board = LifeBoard.fromReader(new InputStreamReader(is));

        System.out.println(board);

        board.nextState(4);

        // should have moved
    }

}