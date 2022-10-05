package com.password.validator.rules;

public class MoreThanGivenCharactersRule implements PasswordRule {

  private final int numOfCharacters;

  public MoreThanGivenCharactersRule(int numOfCharacters) {
    this.numOfCharacters = numOfCharacters;
  }

  @Override
  public boolean validate(String password) {
    return password.length() > numOfCharacters;
  }
}
