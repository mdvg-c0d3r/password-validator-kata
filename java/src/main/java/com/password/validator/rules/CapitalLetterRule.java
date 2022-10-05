package com.password.validator.rules;

import java.util.regex.Pattern;

public class CapitalLetterRule implements PasswordRule {
  @Override
  public boolean validate(String password) {
    Pattern uppercasePattern = Pattern.compile("[A-Z]");
    return uppercasePattern.matcher(password).find();
  }
}
