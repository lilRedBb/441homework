package java.org.app;

/**
 * @author lilred
 * @date 2024/01/28
 **/

import org.app.Calculation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Assert;

/**
 * @author lilred
 * @date 2024/01/28
 **/
public class CalculationTest {
    @Test
    public void testMultiPlyTest() {
        // Given
        int input = 5;
        double expected = 15.0; // Since 5 * 3 = 15

        // When
        double result = Calculation.multiPly(input);

        // Then
        Assert.assertEquals("The multiPly method should multiply the input by 3", expected, result, 0.001);
    }


//    @Test
//    public void testMultiPlyFailureScenario() {
//        // Given
//        int input = 5;
//        double incorrectExpected = 20.0; // Intentionally incorrect expected value
//
//        // When
//        double result = Calculation.multiPly(input);
//
//        // Then
//        Assert.assertEquals("This test is expected to fail as the expected result is intentionally incorrect", incorrectExpected, result, 0.001);
//    }

}

