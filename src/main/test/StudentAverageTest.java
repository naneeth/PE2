import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class StudentAverageTest {

    StudentAverage obj;
    @Before
    public void setUp() {
        //System.out.println("Inside setup");
        obj = new StudentAverage();
    }

    @Test
    public void studentAverageSuccess() {
        int[] arr = new int[]{86, 65, 98, 77};
        int expectedValueMin = 65;
        int actualValueMin = obj.studentMin(4, arr);
        assertEquals(expectedValueMin, actualValueMin);

        int expectedValueMax = 98;
        int actualValueMax = obj.studentMax(4, arr);
        assertEquals(expectedValueMax, actualValueMax);

        String expectedValueAvg = "81.50";
        String actualValueAvg = obj.studentAvg(4, arr);
        assertEquals(expectedValueAvg, actualValueAvg);
    }

    @Test
    public void studentAverageFailure()
    {
        int[] arr = {86, 101, 98, 77};
        int expectedValueMin = -1;
        int actualValueMin = obj.studentMin(4, arr);
        assertEquals(expectedValueMin, actualValueMin);

        int expectedValueMax = -1;
        int actualValueMax = obj.studentMax(4, arr);
        assertEquals(expectedValueMax, actualValueMax);

        String expectedValueAvg = "-1";
        String actualValueAvg = obj.studentAvg(4, arr);
        assertEquals(expectedValueAvg, actualValueAvg);
    }

    @After
    public void tearDown() {
        //System.out.println("Inside teardown");
        obj = null;
    }
}