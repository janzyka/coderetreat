/*
 * Copyright © 2018 Merck Sharp & Dohme Corp., a subsidiary of Merck & Co., Inc.
 * All rights reserved.
 */
package com.merck.fun.arrays;

import java.util.function.Function;
import java.util.function.Predicate;

public class ArrayOperations {

    /**
     * Maps each element of an array to different element
     * @param source - source array to apply map operation to
     * @param mapFunction - function mapping element of type S into T element
     * @param <S> - source type
     * @param <T> - target type
     *
     * @return mapped array
     */
    public static <S, T> T[] map(S[] source, Function<S, T> mapFunction) {
        // TODO:
        return null;
    }

    /**
     * Maps each element of an array to different element
     * @param source - source array to be filtered
     * @param filter - predicate which tells whether to keep or drop given item
     * @param <S> - source type
     *
     * @return filtered array
     */
    public static <S> S[] filter(S[] source, Predicate<S> filter) {
        // TODO:
        return null;
    }

    /**
     * Takes first N elements in the array and returns them as a new array
     * @param source - array to take elements from
     * @param n - number of elements to take
     * @param <S> - source type
     *
     * @return array with first N elements
     */
    public static <S> S[] take(S[] source, int n) {
        // TODO:
        return null;
    }

    /**
     * Joins 2 arrays together
     * @param source - first array to combine
     * @param another - another array to combine
     * @param <S> - source type
     *
     * @return combined array
     */
    public static <S> S[] join(S[] source, S[] another) {
        // TODO:
        return null;
    }

    /**
     * Returns the top N unique elements compared by comparator.
     * @param source - source array
     * @param <S> - source type
     *
     * @return array with top N elements
     */
    public static <S extends Comparable<S>> S[] topN(S[] source, int n) {
        // TODO:
        return null;
    }

    /**
     * Return element which would be ideal candidate as PIVOT for sorting algorithm. Ideal PIVOT item is an element
     * for which half of the elements are greater and half of the elements are lower.
     * @param source - source array
     *
     * @return the ideal PIVOT item
     */
    public static <S extends Comparable<S>> S pivot(S[] source) {
        // TODO:
        return null;
    }
}
