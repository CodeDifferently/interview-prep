package com.github.codedifferently;

import com.github.codedifferently.mathutilities.TestAddition;
import com.github.codedifferently.mathutilities.TestDivision;
import com.github.codedifferently.mathutilities.TestMultiplication;
import com.github.codedifferently.mathutilities.TestSubtraction;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by dan on 6/14/17.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestAddition.class,
        TestSubtraction.class,
        TestDivision.class,
        TestMultiplication.class
})
public class TestMathUtilities {
}