/*
 * Copyright © 2018 Merck Sharp & Dohme Corp., a subsidiary of Merck & Co., Inc.
 * All rights reserved.
 */
package com.merck.fun.life;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import org.junit.Test;

// Refer to: https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life
public class LifeBoardTest {

    public static final boolean[][] BEEHIVE = {
            {false, true, true, false},
            {true, false, false, true},
            {false,true,true,false}
    };

    @Test
    public void beehiveIsStableConfiguration() throws Exception {

        LifeBoard board = fromResource("/beehive.txt");

        System.out.println(board);

        board.nextState();

        assertTrue(board.contains(10, 2, BEEHIVE));
    }

    @Test
    public void spaceshipMovesInLeftBottomDirectionAfter4Iterations() throws Exception {

        LifeBoard board = fromResource("/spaceship.txt");

        System.out.println(board);

        board.nextState(4);

        // should have moved
    }

    private LifeBoard fromResource(String resource) throws IOException  {
        try (Reader reader = new InputStreamReader(getClass().getResourceAsStream(resource))) {
            return LifeBoard.fromReader(reader);
        }
    }
}