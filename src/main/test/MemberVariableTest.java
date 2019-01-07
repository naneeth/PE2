import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


@RunWith(JUnit4.class)
public class MemberVariableTest{

@Before
public void setUp() {
    MemberVariable obj = new MemberVariable();
}
@Test
public void MemberTestSuccess()
        {
        MemberVariable obj=new MemberVariable();
        String expectedName="Name : Harry Potter";
        String actualName=obj.memberName("Name : Harry Potter");
        assertEquals(expectedName,actualName);
        int expectedAge=60;
        int actualAge=obj.memberAge(60);
        assertEquals(expectedAge,actualAge);
        String expectedSalary="2700";
        String actualSalary=obj.memberSalary("2700");
        assertEquals(expectedSalary,actualSalary);
        }
@Test
public void MemberTestFailure()
        {
        MemberVariable obj = new MemberVariable();
        String expectedValue1="";
        String actualValue1=obj.memberName("nan");
        assertNotEquals(expectedValue1,actualValue1);
        }
   @After
public void tearDown()
        {
        MemberVariable obj = new MemberVariable();
        obj=null;
        }
}







