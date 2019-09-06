package com.zipcodewilmington.assessment1.part2;

import com.zipcodewilmington.assessment1.UnitTestingUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtilsTest {
    @Test
    public void getWordsTest() {
        // Given
        String inputString = null;
        String[] expected = null;

        // When
        String[] actual = StringUtils.getWords(inputString);

        // Then
        UnitTestingUtils.assertArrayEquality(expected, actual);
    }


    @Test
    public void getFirstWordTest() {
        // Given
        String inputString = null;
        String expected = null;

        // When
        String actual = StringUtils.getFirstWord(inputString);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void reverseFirstWordTest() {
        // Given
        String inputString = null;
        String expected = null;

        // When
        String actual = StringUtils.reverseFirstWord(inputString);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseFirstWordThenCamelCaseTest() {
        // Given
        String inputString = null;
        String expected = null;

        // When
        String actual = StringUtils.reverseFirstWord(inputString);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void removeCharacterAtIndexTest() {
        // Given
        String inputString = null;
        Integer characterIndex = null;
        String expected = null;

        // When
        String actual = StringUtils.removeCharacterAtIndex(inputString, characterIndex);

        // Then
        Assert.assertEquals(expected, actual);
    }

}
