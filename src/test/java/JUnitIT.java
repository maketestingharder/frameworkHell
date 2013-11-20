import org.junit.BeforeClass;
import org.junit.Test;

/**
 * email: maketestingharder@gmail.com
 * blog: www.maketestingharder.blogspot.com
 * FB: www.facebook.com/maketestingharder
 */
public class JUnitIT {

    @BeforeClass
    public static void setup(){
        System.out.println("JUnit Integration test - setup");
    }

    @Test
    public void sampleJUnitUnitTest(){
        System.out.println("JUnit Integration test - test");
    }
}
