package PasswordVerifier.rules;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MoreThanGivenCharactersRuleTest {

  private MoreThanGivenCharactersRule moreThanGivenCharactersRule;

  @Test
  public void shouldReturnTrueWhenPasswordHasMoreThanEightCharacters() {
    var password = "passwords";
    moreThanGivenCharactersRule = new MoreThanGivenCharactersRule(8);

    var result = moreThanGivenCharactersRule.validate(password);

    assertTrue(result);
  }

  @Test
  public void shouldReturnFalseWhenPasswordHasEightOrLessCharacters() {
    var password = "password";
    moreThanGivenCharactersRule = new MoreThanGivenCharactersRule(8);

    var result = moreThanGivenCharactersRule.validate(password);

    assertFalse(result);
  }

  @Test
  public void shouldReturnTrueWhenPasswordHasMoreThanSixCharacters() {
    var password = "passwords";
    moreThanGivenCharactersRule = new MoreThanGivenCharactersRule(6);

    var result = moreThanGivenCharactersRule.validate(password);

    assertTrue(result);
  }

  @Test
  public void shouldReturnFalseWhenPasswordHasSixOrLessCharacters() {
    var password = "pass";
    moreThanGivenCharactersRule = new MoreThanGivenCharactersRule(6);

    var result = moreThanGivenCharactersRule.validate(password);

    assertFalse(result);
  }

  @Test
  public void shouldReturnTrueWhenPasswordHasMoreThanSixteenCharacters() {
    var password = "quitelongpassword";
    moreThanGivenCharactersRule = new MoreThanGivenCharactersRule(16);

    var result = moreThanGivenCharactersRule.validate(password);

    assertTrue(result);
  }

  @Test
  public void shouldReturnFalseWhenPasswordHasSixteenOrLessCharacters() {
    var password = "shortpassword";
    moreThanGivenCharactersRule = new MoreThanGivenCharactersRule(16);

    var result = moreThanGivenCharactersRule.validate(password);

    assertFalse(result);
  }
}
