/*
 * Copyright © 2018 Merck Sharp & Dohme Corp., a subsidiary of Merck & Co., Inc.
 * All rights reserved.
 */
package com.merck.fun.arrays;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayOperationsTest {

    @Test
    public void top3ElementsAreTaken() {
        Integer[] array = {1, 8, 3, 15, 7, 8};

        Integer[] tops = ArrayOperations.topN(array, 3);

        assertEquals(3, tops.length);
        assertTrue(asList(tops).containsAll(asList(15, 8, 7)));
    }

    @Test
    public void pivotIsTheMiddleItem() {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};

        assertEquals((Integer) 4, ArrayOperations.pivot(array));
    }

}