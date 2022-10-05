package PasswordVerifier;

import java.util.regex.Pattern;

public class PasswordVerifier {
  public boolean verifyMoreThanEightCharacters(String password) {
    boolean result = password.length() > 8;

    return result;
  }

  public boolean verifyCapitalLetter(String password) {
    Pattern uppercasePattern = Pattern.compile("[A-Z]");
    boolean result = uppercasePattern.matcher(password).find();
    return result;
  }

  public boolean verifyLowerCaseLetter(String password) {
    Pattern lowerCasePattern = Pattern.compile("[a-z]");
    boolean result = lowerCasePattern.matcher(password).find();
    return result;
  }

  public boolean verifyContainsANumber(String password) {
    Pattern lowerCasePattern = Pattern.compile("\\d");
    boolean result = lowerCasePattern.matcher(password).find();
    return result;
  }
}
