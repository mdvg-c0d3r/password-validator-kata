package com.password.validator.rules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LowerLetterRuleTest {
  private LowerLetterRule lowerLetterRule;

  @BeforeAll
  public void setUp() {
    lowerLetterRule = new LowerLetterRule();
  }

  @Test
  public void shouldReturnTrueWhenPasswordHasAtLeastALowerCase() {
    var password = "PASSWORd";

    var result = lowerLetterRule.validate(password);

    Assertions.assertTrue(result);
  }

  @Test
  public void shouldReturnFalseWhenPasswordHasNoLowerCase() {
    var password = "PASSWORD";

    var result = lowerLetterRule.validate(password);

    Assertions.assertFalse(result);
  }
}
