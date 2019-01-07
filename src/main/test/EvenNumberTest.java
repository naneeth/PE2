import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvenNumberTest
{
    EvenNumber obj;
    @Before
    public void setUp() throws Exception
    {  obj = new EvenNumber();


    }

    @Test
    public void demoTestSuccess()
    {

        boolean expectedValue1 = true;
        boolean actualValue1 = obj.isEven(128);
        //Assert
        assertEquals(expectedValue1, actualValue1);
    }

    @Test
    public void demoTestFailure()
    {

        boolean expectedValue2 = false;
        boolean actualValue2 = obj.isEven(73);
        //Assert
        assertEquals(expectedValue2, actualValue2);
    }
    @After
    public void tearDown() throws Exception
    {
        obj = null;
    }
}
