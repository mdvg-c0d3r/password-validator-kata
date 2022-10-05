package com.password.validator;

import com.password.validator.rules.PasswordRule;

import java.util.Collection;

public class PasswordValidator {

  private final Collection<PasswordRule> rules;

  public PasswordValidator(Collection<PasswordRule> rules) {
    this.rules = rules;
  }

  public boolean validate(String password) {
    if(rules.isEmpty()) {
      return false;
    }

    boolean result = true;

    for(var rule : rules) {
      result = result && rule.validate(password);
    }

    return result;
  }
}
