import java.util.regex.Pattern;

public class UserRegistrationLambda {
    public static void main(String[] args) throws InvalidUserException {
        UserValidatorLambda.Check firstNameRegex = (String pattern, String firstName) -> {
            try {
                if (Pattern.matches(pattern, firstName))
                    return true;
                else
                    return false;
            } catch (NullPointerException e) {
                throw new InvalidUserException("Please enter proper message");
            }
        };
        UserValidatorLambda.Check lastNameRegex = (String pattern, String lastName) -> {
            try {
                if (Pattern.matches(pattern, lastName))
                    return true;
                else
                    return false;
            } catch (NullPointerException e) {
                throw new InvalidUserException("Please enter proper message");
            }
        };
        UserValidatorLambda.Check emailRegex = (String pattern, String email) -> {
            try {
                if (Pattern.matches(pattern, email))
                    return true;
                else
                    return false;
            } catch (NullPointerException e) {
                throw new InvalidUserException("Please enter proper message");
            }
        };
        UserValidatorLambda.Check phoneRegex = (String pattern, String phoneNumber) -> {
            try {

                if (Pattern.matches(pattern, phoneNumber))
                    return true;
                else
                    return false;
            } catch (NullPointerException e) {
                throw new InvalidUserException("Please enter proper message");
            }
        };
        UserValidatorLambda.Check passwordRegex = (String pattern, String password) -> {
            try {
                if (Pattern.matches(pattern, password))
                    return true;
                else
                    return false;
            } catch (NullPointerException e) {
                throw new InvalidUserException("Please enter proper message");
            }
        };

        firstNameRegex.check("^[A-Z]{1}[a-z]{2,}$", "Parag");
        firstNameRegex.check("^[A-Z]{1}[a-z]{2,}$", "parag");
        firstNameRegex.check("^[A-Z]{1}[a-z]{2,}$", "par");
        firstNameRegex.check("^[A-Z]{1}[a-z]{2,}$", "Par");
        lastNameRegex.check("^[A-Z]{1}[a-z]{2,}$", "Lande");
        lastNameRegex.check("^[A-Z]{1}[a-z]{2,}$", "lande");
        lastNameRegex.check("^[A-Z]{1}[a-z]{2,}$", "lan");
        lastNameRegex.check("^[A-Z]{1}[a-z]{2,}$", "Lan");
        emailRegex.check("^[a-zA-Z0-9.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$", "paraglande8258@gmail.com");
        emailRegex.check("^[a-zA-Z0-9.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$", "Parag@gmail.co.in");
        emailRegex.check("^[a-zA-Z0-9.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$", "parag199831#gmail.com");
        phoneRegex.check("^[1-9][0-9]+[ ]{0,1}+[1-9][0-9]{9}$", "91 7350352075");
        phoneRegex.check("^[1-9][0-9]+[ ]{0,1}+[1-9][0-9]{9}$", "91 7350323232");
        passwordRegex.check("(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%!]{1}).{8,}", "Parag@123");
        passwordRegex.check("(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%!]{1}).{8,}", "Parag$12345");

    }
}