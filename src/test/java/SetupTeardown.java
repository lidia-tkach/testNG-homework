import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SetupTeardown {

    @BeforeClass
    public void setup() {
        System.out.println("setup");
    }

    @Test
    public void justTest() {
        System.out.println("Just some test to launch Before/AfterClass");
    }

    @AfterClass
    public void teardown() {
        System.out.println("teardown");
    }
}
