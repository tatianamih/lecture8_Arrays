package jrr.by.service;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayServiceTest extends TestCase {

    int[] newArray = {2,3,1};


    public void testCreateArrayLength() {
        ArrayService arrayService = new ArrayService();
        int[] array = arrayService.create(3);

        int expected = 3;
        int actual = array.length;
        assertEquals(expected, actual);
    }

    public void testCreateArray() {
        ArrayService arrayService = new ArrayService();

        int[] expected = {0, 0, 0};
        int[] actual = arrayService.create(3);
        assertArrayEquals(expected, actual);
    }

    public void testFillRandomly() {
        ArrayService arrayService = new ArrayService();

        int[] array = arrayService.create(2);
        int[] expectedArray = {0, 0, 0};

        arrayService.fillRandomly(newArray);
        if (array == null) {
            for (int i = 0; i < array.length; i++) {
                array[i] = 0;

                assertEquals(0, i);
            }
        }
    }


      public void testSum() {
        ArrayService arrayService = new ArrayService();

        assertEquals(6, arrayService.sum(newArray));
    }

    public void testAvg() {
        ArrayService arrayService = new ArrayService();
        assertEquals(2.0, arrayService.avg(newArray), 0);
    }

 @Test
    public void sort() {
        ArrayService arrayService = new ArrayService();
        int[] expected = { 1,2,3};
        arrayService.sort(newArray);
        assertArrayEquals(expected, newArray);
    }

@Test
    public void swap() {
        ArrayService arrayService = new ArrayService();
        int[] expected = { 3,2,1};
        arrayService.swap(newArray);
        assertArrayEquals(expected, newArray);
    }
}