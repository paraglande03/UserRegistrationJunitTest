import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class TestUserValidator {



        //use case 1 test cases for first name
        @Test
        //when the name starts with a capital letter
        public void givenFirstName_ShouldReturn_True() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validateFirstName("Parag");
            Assert.assertEquals(true, result);
        }
        @Test
        //when a name starts with a small letter
        public void givenFirstName_ShouldReturn_False() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validateFirstName("parag");
            Assert.assertEquals(false, result);
        }
        //when a name has 3 or more letters
        @Test
        public void givenFirstName_MinimumThreeLetters_ShouldReturn_True() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validateFirstName("Par");
            Assert.assertEquals(true, result);
        }
        @Test
        //when a name does not contain 3 minimum letters
        public void givenFirstName_NotHaveMinimumThreeLetters_ShouldReturn_False() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validateFirstName("Pa");
            Assert.assertEquals(false, result);
        }


}
