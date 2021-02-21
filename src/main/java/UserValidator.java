import java.util.regex.Pattern;
import java.util.regex.Pattern;
public class UserValidator {



        private final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";

        public boolean validateFirstName(String firstName) {
            Pattern pattern = Pattern.compile(NAME_PATTERN);
            return pattern.matcher(firstName).matches();
        }

}
