import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class TestUserValidator {


    //   test cases for first name
        @Test
        public void givenFirstName_ShouldReturn_True() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validateFirstName("Parag");
            Assert.assertEquals(true, result);
        }
        @Test
        public void givenFirstName_ShouldReturn_False() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validateFirstName("parag");
            Assert.assertEquals(false, result);
        }
        @Test
        public void givenFirstName_MinimumThreeLetters_ShouldReturn_True() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validateFirstName("Par");
            Assert.assertEquals(true, result);
        }
        @Test
        public void givenFirstName_NotHaveMinimumThreeLetters_ShouldReturn_False() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validateFirstName("Pa");
            Assert.assertEquals(false, result);
        }


//      TEST CASES FOR LAST NAME
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


//        TEST CASES FOR E-MAIL
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


//            TEST CASES FOR PHONE NUMBER

        @Test
        public void givenPhoneNumber_WhenPhoneNumberIsFollowedByCountryCode_True() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validatePhone("91 9604445258");
            Assert.assertEquals(true, result);
        }

        @Test
        public void givenPhoneNumber_WhenPhoneNumberIsNotFollowedByCountryCode_ShouldReturn_False() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validatePhone("8105215414");
            Assert.assertEquals(false, result);
        }

        @Test
        public void givenPhoneNumber_WhenPhoneNumberIsTenDigit_True() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validatePhone("91 9604445258");
            Assert.assertEquals(true, result);
        }

        @Test
        public void givenPhoneNumber_WhenPhoneNumberIsNotTenDigit_ShouldReturn_False() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validatePhone("91 8105215");
            Assert.assertEquals(false, result);
        }

        //      TEST CASESS FOR PASSWORD RULE 1 - 8 CHARACTERS
        @Test
        public void givenPassword_WhenPasswordIsMinimumEightDigit_ShouldReturn_True() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validatePassword("Parag234$");
            Assert.assertEquals(true, result);
        }

        @Test
        public void givenPassword_WhenPasswordIsNotMinimumEightDigit_ShouldReturn_False() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validatePassword("parag");
            Assert.assertEquals(false, result);
        }
//      TEST CASES FOR PASSWORD RULE 2 - AT LEAST ONE CAPITAL LETTER
    @Test
    public void givenPassword_WhenPasswordHaveAtleastOneCapitalLetter_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("Parag123@");
        Assert.assertEquals(true, result);
}

    @Test
    public void givenPassword_WhenPasswordNotHaveAtleastOneCapitalLetter_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("paraglande@");
        Assert.assertEquals(false, result);
    }

//    TEST CASES FOR PASSWORD RULE 3 - ONE NUMERIC AT LEAST
    @Test
    public void givenPassword_WhenPasswordHaveAtleastOneNumericNumber_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("Paraglande2$");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenPasswordNotHaveAtleastOneNumericNumber_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("adased@");
        Assert.assertEquals(false, result);
    }
//    TEST CASES FOR PASSWORD RULE 3- ONE SPECIAL CHARACTER

    @Test
    public void givenPassword_WhenPasswordHaveAtleastOneSpeacialCharacter_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("Parag234$");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenPasswordNotHaveAtleastOneSpeacialCharacter_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("parag123");
        Assert.assertEquals(false, result);
    }
}
