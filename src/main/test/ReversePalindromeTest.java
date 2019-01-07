import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ReversePalindromeTest
{   ReversePalindrome obj;

    @Before
    public void setUp() throws Exception {
        ReversePalindrome obj = new ReversePalindrome();
    }

    @Test
    public void palindromeTestSuccess()
    {
        String expectedValue = "abcdcba is a palindrome";
        String actualValue = obj.function("abcdcba");
        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void palindromeTestFailure()
    {
        String expectedValue = "Not a palindrome";
        String actualValue = obj.function("12345");
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @After
    public void tearDown() throws Exception {

    }
}
