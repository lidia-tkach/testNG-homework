import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestGroups {

    @BeforeGroups("smoke")
    public void setup() {
        System.out.println("The app is open");
    }

    @AfterGroups("smoke")
    public void teardown() {
        System.out.println("The app is closed");
    }

    @Test(dependsOnGroups = {"smoke", "sanity"})
    public void performAfterGroups() {
        System.out.println("Test is performed after smoke groups");
    }

    @Test(groups = "smoke")
    public void liveView() {
        System.out.println("Live View test");
    }

    @Test(groups = "smoke")
    public void events() {
        System.out.println("Events test");
    }

    @Test(groups = "sanity")
    public void dashboardView() {
        System.out.println("Dashboard view test");
    }

    @Test(groups = "regression")
    public void expiredPN() {
        System.out.println("Expired push notification test");
    }

    @Test(groups = "regression")
    public void notificationSound() {
        System.out.println("Notification sound test");
    }
}
