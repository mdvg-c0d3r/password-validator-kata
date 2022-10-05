package com.password.validator.rules;

import java.util.regex.Pattern;

public class UnderscoreRule implements PasswordRule {

  @Override
  public boolean validate(String password) {
    Pattern lowerCasePattern = Pattern.compile("_");
    return lowerCasePattern.matcher(password).find();
  }
}
