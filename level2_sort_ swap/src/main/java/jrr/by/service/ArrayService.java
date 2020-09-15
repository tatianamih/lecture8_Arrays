package jrr.by.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.SecureRandom;


public class ArrayService {

    Logger logger = LoggerFactory.getLogger(ArrayService.class);

    public int[] create(int size) {

        return new int[size];
    }

    public void fillRandomly(int[] array) {

        SecureRandom random = new SecureRandom();

        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100) + 0;
            }
        }
    }

    public void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            logger.info("array[{}] = {}", i, array[i]);
        }
    }

    public int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public double avg(int[] array) {
        double avg = 0;
        if (array != null) {
            avg = (double) sum(array) / array.length;
        }
        return avg;
    }

    public void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minI = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < min) {
                    min = array[j];
                    minI = j;
                }
            }
            if (i != minI) {
                int temp = array[i];
                array[i] = array[minI];
                array[minI] = temp;

            }
        }
    }


    public void swap(int[] array) {
        for (int i = 0; i < array.length  ; i++) {

            int max = array[i];
            int maxI = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] > max) {
                    max = array[j];
                    maxI = j;
                }
            }

            if (i != maxI) {
                int tmp = array[i];
                array[i] = array[maxI];
                array[maxI] = tmp;
            }
        }
    }
}
    

        
         
       


  

