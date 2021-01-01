package PasswordChecker;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// length should be between 8 and 14
// should have at least one upper case and one lower case at least
// should have at least 2 digits
// should have at least one special character
public class TraditionalWay {
    public String checkPasswordAndSubmit(String password) {
        int length = password.length();

        if (length < 8) return "Password is under 8 characters";

        if (length > 14) return "Password is above 14 characters";

        if (password.equals(password.toLowerCase())) return "Password must have at least one uppercase letter";

        if (password.equals(password.toUpperCase())) return "Password must have at least one lowercase letter";

        if(password.replaceAll("\\D", "").length() < 2) return "Password must have at least two digits";

        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(password);
        if (!m.find()) return "Password must have at least one special character";

        else return "Submitted";
    }
}
