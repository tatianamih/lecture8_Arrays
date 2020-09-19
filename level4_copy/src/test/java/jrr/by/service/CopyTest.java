package jrr.by.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CopyTest {

    @Test
    public void copyInRange() {
        Copy copy = new Copy();
        int[] array = {40, 50, 100, 200};
        int[] expected = {50, 100};
        int[] actual = copy.copyInRange(array, 41, 150);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void copyInRangeRunLenghtOfNewArray() {
        Copy copy = new Copy();
        int[] array = {40, 50, 100, 200};
        int expected = 2;
        int actual = copy.copyInRangeRunLenghtOfNewArray(array, 41, 150);
        assertEquals(expected, actual);
    }
}