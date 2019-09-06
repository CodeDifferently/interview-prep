package com.zipcodewilmington.assessment1.part2;

import com.zipcodewilmington.assessment1.UnitTestingUtils;
import org.junit.Test;

/**
 * Created by leon on 2/16/18.
 */
public class DeleteMultiplesTest {
    MultiplesDeleter q1 = new MultiplesDeleter();


    @Test
    public void deleteEvensTest() {
        // Given 
        Integer[] inputArray = null;
        Integer[] expected = null;

        // When
        Integer[] actual = q1.deleteEvens(inputArray);

        // Then
        UnitTestingUtils.assertArrayEquality(expected, actual);
    }


    @Test
    public void deleteOddsTest() {
        // Given 
        Integer[] inputArray = null;
        Integer[] expected = null;

        // When
        Integer[] actual = q1.deleteOdds(inputArray);

        // Then
        UnitTestingUtils.assertArrayEquality(expected, actual);
    }


    @Test
    public void deleteMultiplesOf3Test() {
        // Given 
        Integer[] inputArray = null;
        Integer[] expected = null;

        // When
        Integer[] actual = q1.deleteMultiplesOf3(inputArray);

        // Then
        UnitTestingUtils.assertArrayEquality(expected, actual);
    }


    @Test
    public void deleteMultiplesOfNTest() {
        // Given
        Integer multiple = null;
        Integer[] inputArray = null;
        Integer[] expected = null;

        // When
        Integer[] actual = q1.deleteMultiplesOfN(inputArray, multiple);

        // Then
        UnitTestingUtils.assertArrayEquality(expected, actual);
    }

}
