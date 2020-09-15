package jrr.by.service;


import junit.framework.TestCase;

public class ArrayServiceTest extends TestCase {

    int[] newArray = {1,2,3};


    public void testCreate() {
        ArrayService arrayService = new ArrayService();
        arrayService.create(2);
        int[] expected = {0,0};

        assertEquals(expected.length, 2);
    }

    public void testFillRandomly() {
        ArrayService arrayService = new ArrayService();

        int[] array = arrayService.create(2);
        int[] expectedArray = {0,0,0};

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

        assertEquals(2.0, arrayService.avg(newArray));
    }
} 