package PasswordVerifier.rules;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CapitalLetterRuleTest {

  private CapitalLetterRule capitalLetterRule;

  @BeforeAll
  void setUp() {
    capitalLetterRule = new CapitalLetterRule();
  }

  @Test
  public void shouldReturnTrueWhenPasswordHasAtLeastACapitalLetter() {
    var password = "paSsword";

    var result = capitalLetterRule.validate(password);

    assertTrue(result);
  }

  @Test
  public void shouldReturnFalseWhenPasswordHasNotCapitalLetter() {
    var password = "password";

    var result = capitalLetterRule.validate(password);

    assertFalse(result);
  }
}
