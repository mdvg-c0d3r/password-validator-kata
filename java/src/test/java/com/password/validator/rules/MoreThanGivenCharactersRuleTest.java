package com.password.validator.rules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoreThanGivenCharactersRuleTest {

  private MoreThanGivenCharactersRule moreThanGivenCharactersRule;

  @Test
  public void shouldReturnTrueWhenPasswordHasMoreThanEightCharacters() {
    var password = "passwords";
    moreThanGivenCharactersRule = new MoreThanGivenCharactersRule(8);

    var result = moreThanGivenCharactersRule.validate(password);

    Assertions.assertTrue(result);
  }

  @Test
  public void shouldReturnFalseWhenPasswordHasEightOrLessCharacters() {
    var password = "password";
    moreThanGivenCharactersRule = new MoreThanGivenCharactersRule(8);

    var result = moreThanGivenCharactersRule.validate(password);

    Assertions.assertFalse(result);
  }

  @Test
  public void shouldReturnTrueWhenPasswordHasMoreThanSixCharacters() {
    var password = "passwords";
    moreThanGivenCharactersRule = new MoreThanGivenCharactersRule(6);

    var result = moreThanGivenCharactersRule.validate(password);

    Assertions.assertTrue(result);
  }

  @Test
  public void shouldReturnFalseWhenPasswordHasSixOrLessCharacters() {
    var password = "pass";
    moreThanGivenCharactersRule = new MoreThanGivenCharactersRule(6);

    var result = moreThanGivenCharactersRule.validate(password);

    Assertions.assertFalse(result);
  }

  @Test
  public void shouldReturnTrueWhenPasswordHasMoreThanSixteenCharacters() {
    var password = "quitelongpassword";
    moreThanGivenCharactersRule = new MoreThanGivenCharactersRule(16);

    var result = moreThanGivenCharactersRule.validate(password);

    Assertions.assertTrue(result);
  }

  @Test
  public void shouldReturnFalseWhenPasswordHasSixteenOrLessCharacters() {
    var password = "shortpassword";
    moreThanGivenCharactersRule = new MoreThanGivenCharactersRule(16);

    var result = moreThanGivenCharactersRule.validate(password);

    Assertions.assertFalse(result);
  }
}
