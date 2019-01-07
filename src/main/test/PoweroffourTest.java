import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)

public class PoweroffourTest
{
    Poweroffour obj ;

    @Before
    public void setUp() throws Exception
    {
       obj = new Poweroffour();

    }

    @Test
    public void poweroffourTestSuccess()
    {
        boolean expectedValue1 = true;
        boolean actualValue1 = obj.function(256);
        //Assert
        assertEquals(expectedValue1, actualValue1);
    }

    @Test
    public void poweroffourTestFailure()
    {
        boolean expectedValue2 = false;
        boolean actualValue2 = obj.function(40);
        //Assert
        assertEquals(expectedValue2, actualValue2);
    }
    @After
    public void tearDown() throws Exception
    {

    }
}
