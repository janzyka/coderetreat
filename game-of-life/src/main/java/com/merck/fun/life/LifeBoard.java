/*
 * Copyright © 2018 Merck Sharp & Dohme Corp., a subsidiary of Merck & Co., Inc.
 * All rights reserved.
 */
package com.merck.fun.life;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class LifeBoard {

    private boolean[][] board;

    public static LifeBoard empty(int width, int height) {
        LifeBoard board = new LifeBoard();
        board.board = new boolean[height][width];

        return board;
    }

    /**
     * Creates new board from a text source, convenient for testing.
     * @param reader the board source
     * @return the LifeBoard instance
     * @throws IOException
     */
    public static LifeBoard fromReader(Reader reader) throws IOException  {
        try (BufferedReader r = new BufferedReader(reader)) {

            String header = r.readLine();
            String[] splits = header.split(" ");

            int width = Integer.valueOf(splits[0].trim());
            int height = Integer.valueOf(splits[0].trim());

            LifeBoard lifeBoard = LifeBoard.empty(width, height);

            String line;
            int lineIndex = 0;

            while ((line = r.readLine()) != null) {
                for (int i = 0; i< width; i ++) {
                    if (line.charAt(i) == 'X') {
                        lifeBoard.setAlive(i, lineIndex);
                    }
                }

                lineIndex ++;
            }

            return lifeBoard;
        }
    }

    /**
     * Momves board 1 iteration forward
     * @return
     */
    public LifeBoard nextState() {

        // TODO:
        return this;
    }

    /**
     * Tells whether board contains given shape on given coordinates
     * @param x - X coordinate
     * @param y - Y coordinate
     * @param shape - shape to test
     * @return true if contains sub-shape, false otherwise
     */
    public boolean contains(int x, int y, boolean[][] shape) {
        //TODO:
        return false;
    }

    /**
     * Moves board by N iterations
     * @param iterations number of iterations to make
     * @return
     */
    public LifeBoard nextState(int iterations) {

        for (int i=0; i < iterations; i++) {
            nextState();
        }

        return this;
    }

    public boolean isAlive(int x, int y) {
        return board[y][x];
    }

    public void setAlive(int x, int y) {
        board[y][x] = true;
    }

    public void setEmpty(int x, int y) {
        board[y][x] = false;
    }

    public boolean isEmpty() {
        for (int y = 0; y < board.length; y ++) {
            for (int x = 0; x < board[y].length; x ++) {
                if (board[y][x]) {
                    return false;
                }
            }
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        for (int y = 0; y < board.length; y ++) {
            for (int x = 0; x < board[y].length; x ++) {
                if (board[y][x]) {
                    sb.append("X");
                } else {
                    sb.append(".");
                }
            }

            sb.append("\n");
        }

        return sb.toString();
    }
}
