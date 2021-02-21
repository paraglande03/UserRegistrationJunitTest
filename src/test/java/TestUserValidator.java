import org.junit.jupiter.api.Test;
//import static org.junit.Assert.*;
//
//import org.junit.Assert;
import org.testng.Assert;

public class TestUserValidator {



        //use case 1 test cases for first name
        @Test
        //when the name starts with a capital letter
        public void givenFirstName_ShouldReturn_True() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validateFirstName("Avinash");
            Assert.assertEquals(true, result);
        }
        @Test
        //when a name starts with a small letter
        public void givenFirstName_ShouldReturn_False() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validateFirstName("avinash");
            Assert.assertEquals(false, result);
        }
        //when a name has 3 or more letters
        @Test
        public void givenFirstName_MinimumThreeLetters_ShouldReturn_True() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validateFirstName("Avi");
            Assert.assertEquals(true, result);
        }
        @Test
        //when a name does not contain 3 minimum letters
        public void givenFirstName_NotHaveMinimumThreeLetters_ShouldReturn_False() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validateFirstName("Av");
            Assert.assertEquals(false, result);
        }

}
