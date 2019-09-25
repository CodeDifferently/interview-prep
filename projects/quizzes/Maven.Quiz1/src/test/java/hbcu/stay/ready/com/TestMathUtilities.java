package hbcu.stay.ready.com;

import hbcu.stay.ready.com.mathutilities.TestAddition;
import hbcu.stay.ready.com.mathutilities.TestDivision;
import hbcu.stay.ready.com.mathutilities.TestMultiplication;
import hbcu.stay.ready.com.mathutilities.TestSubtraction;
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
