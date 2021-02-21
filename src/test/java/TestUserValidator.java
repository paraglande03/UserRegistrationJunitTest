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

    @Test
    public void givenLastName_WhenLastNameStartsWithCapitalLetter_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Lande");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenLastNameNotStartsWithCapitalLetter_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("lande");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WhenLastNameHaveMinimumThreeLetter_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Lan");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenLastNameNotHaveMinimumThreeLetter_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("la");
        Assert.assertEquals(false, result);
    }
        @Test
        public void givenEmail_WhenEmailStartsWithSmallLetter_ShouldReturn_True() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validateEmail("paraglande03@gmail.com");
            Assert.assertEquals(true, result);
        }

        @Test
        public void givenEmail_WhenEmailNotStartsWithSmallLetter_ShouldReturn_False() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validateEmail("Parag@gmail.com");
            Assert.assertEquals(false, result);
        }

        @Test
        public void givenEmail_WhenEmailEndsWithComOrIn_ShouldReturn_True() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validateEmail("abc111@yahoo.com");
            Assert.assertEquals(true, result);
        }

        @Test
        public void givenEmail_WhenEmailNotEndsWithComOrIn_ShouldReturn_False() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validateEmail("Abc@gmail.kjnk");
            Assert.assertEquals(false, result);
        }


}
