import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * email: maketestingharder@gmail.com
 * blog: www.maketestingharder.blogspot.com
 * FB: www.facebook.com/maketestingharder
 */
public class TestNGIT {

    @BeforeClass
    public void setup(){
        System.out.println("TestNG Integration test - setup");
    }

    @Test
    public void sampleJUnitUnitTest(){
        System.out.println("TestNG Integration test - test");
    }
}
