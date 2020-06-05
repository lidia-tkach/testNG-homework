import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedMethods {

    @Parameters({"email", "number"})
    @Test
    public void parametersFromXML(String email, String number) {
        System.out.println("The email address is " + email);
        System.out.println("The phone number is " + number);
    }

    @DataProvider(name = "LoginProvider")
    public Object[] getLoginData() {
        return new Object[][]{
                {"firstUser", "firstPassword"},
                {"secondUser", "secondPassword"},
                {"thirdUser", "thirdUser"}
        };
    }

    @Test(dataProvider = "LoginProvider")
    public void loginWithDataProvider(String username, String password) {
        System.out.print("Username is " + username + ". ");
        System.out.println("Password is " + password + ".");
    }
}
