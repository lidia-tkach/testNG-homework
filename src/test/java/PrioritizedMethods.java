import org.testng.annotations.Test;

public class PrioritizedMethods {

    @Test(priority = 3)
    public void firstTest() {
        System.out.println("This test should come third");
    }

    @Test(priority = 2)
    public void secondTest() {
        System.out.println("This test should come second");
    }

    @Test(priority = 1)
    public void thirdTest() {
        System.out.println("This test should come first");
    }
}
