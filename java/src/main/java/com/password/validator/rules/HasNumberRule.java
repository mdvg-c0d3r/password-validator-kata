package com.password.validator.rules;

import java.util.regex.Pattern;

public class HasNumberRule implements PasswordRule {
  @Override
  public boolean validate(String password) {
    Pattern lowerCasePattern = Pattern.compile("\\d");
    return lowerCasePattern.matcher(password).find();
  }
}
