package com.zipcodewilmington.assessment1.part2;

import com.zipcodewilmington.assessment1.UnitTestingUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtilsTest {
    @Test
    public void getNumberOfOccurrencesTest1() {
        // Given
        Integer valueToEvaluate = null;
        Integer expected = null;
        Integer[] inputArray = null;

        // When
        Integer actual = ArrayUtils.getNumberOfOccurrences(inputArray, valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeValueTest1() {
        // Given
        Integer valueToRemove = null;
        Integer[] expected = null;
        Integer[] inputArray = null;

        // When
        Integer[] actual = (Integer[]) ArrayUtils.removeValue(inputArray, valueToRemove);

        // Then
        UnitTestingUtils.assertArrayEquality(expected, actual);
    }


    @Test
    public void getMostCommonTest() {
        // Given
        Integer[] expected = null;
        Integer[] inputArray = null;

        // When
        Integer[] actual = (Integer[]) ArrayUtils.getMostCommon(inputArray);

        // Then
        UnitTestingUtils.assertArrayEquality(expected, actual);
    }

    @Test
    public void getLeastCommonTest() {
        // Given
        Integer[] expected = null;
        Integer[] inputArray = null;

        // When
        Integer[] actual = (Integer[]) ArrayUtils.getLeastCommon(inputArray);

        // Then
        UnitTestingUtils.assertArrayEquality(expected, actual);
    }
}
