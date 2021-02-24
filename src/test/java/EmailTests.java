import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.Before;

import org.junit.runner.RunWith;
import org.testng.Assert;
import java.util.Arrays;
import java.util.List;
@RunWith(Parameterized.class)
public class EmailTests {
    String emailId;
    boolean expectedResult;
    private UserValidator emailVariable;


    public EmailTests(String emailId, boolean expectedResult) {
        this.emailId = emailId;
        this.expectedResult = expectedResult;
    }

    @Before
    public void initialize() {
        emailVariable = new UserValidator();
    }
    @Parameterized.Parameters
    public static List<Object[]> emails() {
        return Arrays.asList(new Object[][]{{"parag@gmail.com", false}, {"parag@gmail.co.in", false}, {"paraggmail.com", false}});
    }


    @Test
    public void testEmailId() {
        System.out.println("parameter email is->" + emailId);
        Assert.assertEquals(expectedResult, emailVariable.multipleEmailvalidate(emailId));

    }

}
