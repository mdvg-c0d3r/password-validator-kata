package com.password.validator.rules;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UnderscoreRuleTest {

  private UnderscoreRule underscoreRule;

  @BeforeAll
  public void setUp() {
    underscoreRule = new UnderscoreRule();
  }

  @Test
  public void shouldReturnTrueWhenPasswordContainsUnderscore() {
    String password = "P_4SSWORd";

    boolean result = underscoreRule.validate(password);

    assertTrue(result);
  }

  @Test
  public void shouldReturnFalseWhenPasswordDoesnotContainsUnderscore() {
    String password = "PASSWORD";

    boolean result = underscoreRule.validate(password);

    assertFalse(result);
  }
}
