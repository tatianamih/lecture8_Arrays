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
}