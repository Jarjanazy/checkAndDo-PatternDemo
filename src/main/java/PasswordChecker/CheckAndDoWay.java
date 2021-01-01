package PasswordChecker;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckAndDoWay {

    public String checkPassword(String password) {
        // have some logic here perhaps
        return checkPasswordLengthAndSubmit(password);
    }

    private String checkPasswordLengthAndSubmit(String password) {
        int length = password.length();

        if (length < 8) return "Password is under 8 characters";

        if (length > 14) return "Password is above 14 characters";

        return checkPassWordCaseSensitivityAndSubmit(password);
    }

    private String checkPassWordCaseSensitivityAndSubmit(String password) {
        if (password.equals(password.toLowerCase())) return "Password must have at least one uppercase letter";

        if (password.equals(password.toUpperCase())) return "Password must have at least one lowercase letter";

        return checkThatTwoDigitsAreGivenAndSubmit(password);
    }

    private String checkThatTwoDigitsAreGivenAndSubmit(String password) {
        if(password.replaceAll("\\D", "").length() < 2) return "Password must have at least two digits";

        return checkThatSpecialCharactersAreGivenAndSubmit(password);
    }

    private String checkThatSpecialCharactersAreGivenAndSubmit(String password) {
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(password);
        if (!m.find()) return "Password must have at least one special character";

        return submit(password);
    }

    private String submit(String password) {
        return "Submitted";
    }
}
