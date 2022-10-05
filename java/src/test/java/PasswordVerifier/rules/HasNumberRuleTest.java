package PasswordVerifier.rules;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class HasNumberRuleTest {

  private HasNumberRule hasNumberRule;

  @BeforeAll
  public void setUp() {
    hasNumberRule = new HasNumberRule();
  }

  @Test
  public void shouldReturnTrueWhenPasswordHasAtLeastANumber() {
    var password = "P4SSWORd";

    var result = hasNumberRule.validate(password);

    assertTrue(result);
  }

  @Test
  public void shouldReturnFalseWhenPasswordHasNoNumber() {
    var password = "PASSWORD";

    var result = hasNumberRule.validate(password);

    assertFalse(result);
  }
}
