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
}
