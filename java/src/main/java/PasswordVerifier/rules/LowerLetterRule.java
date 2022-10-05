package PasswordVerifier.rules;

import java.util.regex.Pattern;

public class LowerLetterRule implements PasswordRule {

  @Override
  public boolean validate(String password) {
    Pattern lowerCasePattern = Pattern.compile("[a-z]");
    return lowerCasePattern.matcher(password).find();
  }
}
