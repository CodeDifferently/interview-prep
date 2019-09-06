package com.zipcodewilmington.assessment1.part1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtilsTest {
    @Test
    public void camelCaseTest() {
        // Given
        String input = null;
        String expected = null;

        // When
        String actual = BasicStringUtils.camelCase(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseTest() {
        // Given
        String input = null;
        String expected = null;

        // When
        String actual = BasicStringUtils.reverse(input);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void reverseThenCamelCaseTest() {
        // Given
        String input = null;
        String expected = null;

        // When
        String actual = BasicStringUtils.reverseThenCamelCase(input);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void removeFirstAndLastCharacterTest() {
        // Given
        String input = null;
        String expected = null;

        // When
        String actual = BasicStringUtils.removeFirstAndLastCharacter(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void invertCasingTest() {
        // Given
        String input = null;
        String expected = null;

        // When
        String actual = BasicStringUtils.invertCasing(input);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
