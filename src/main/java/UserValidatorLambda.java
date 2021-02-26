import java.util.regex.Pattern;

public interface UserValidatorLambda {
    @FunctionalInterface
    interface Check {
        boolean check(String a, String b) throws InvalidUserException;
    }


}

