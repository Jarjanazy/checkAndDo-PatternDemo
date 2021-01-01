package PasswordChecker;

public class CheckAndDoWay {

    public String checkPasswordLengthAndSubmit(String password) {
        int length = password.length();

        if (length < 8) return "Password is under 8 characters";

        if (length > 14) return "Password is above 14 characters";

        else return "Submitted";
    }
}
