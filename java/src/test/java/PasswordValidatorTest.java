import PasswordVerifier.PasswordValidator;
import PasswordVerifier.rules.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PasswordValidatorTest {
  private PasswordValidator passwordValidator;
  private CapitalLetterRule capitalLetterRule;
  private HasNumberRule hasNumberRule;
  private LowerLetterRule lowerLetterRule;
  private MoreThanGivenCharactersRule moreThanGivenCharactersRule;
  private UnderscoreRule underscoreRule;

  @BeforeAll
    public void setUp() {
    capitalLetterRule = mock(CapitalLetterRule.class);
    hasNumberRule = mock(HasNumberRule.class);
    lowerLetterRule = mock(LowerLetterRule.class);
    moreThanGivenCharactersRule = mock(MoreThanGivenCharactersRule.class);
    underscoreRule = mock(UnderscoreRule.class);

    passwordValidator = new PasswordValidator(
      List.of(capitalLetterRule,
        hasNumberRule,
        lowerLetterRule,
        moreThanGivenCharactersRule,
        underscoreRule));
  }

  @Test
  public void shouldReturnTrueWhenIsAValidPassword() {
    var password = "P_4SSWORd";
    when(capitalLetterRule.validate(password)).thenReturn(true);
    when(hasNumberRule.validate(password)).thenReturn(true);
    when(lowerLetterRule.validate(password)).thenReturn(true);
    when(moreThanGivenCharactersRule.validate(password)).thenReturn(true);
    when(underscoreRule.validate(password)).thenReturn(true);

    var result = passwordValidator.validate(password);

    assertTrue(result);
  }

  @Test
  public void shouldReturnFalseWhenIsAnInvalidPassword() {
    var password = "P_4ORd";
    when(capitalLetterRule.validate(password)).thenReturn(true);
    when(hasNumberRule.validate(password)).thenReturn(true);
    when(lowerLetterRule.validate(password)).thenReturn(true);
    when(moreThanGivenCharactersRule.validate(password)).thenReturn(false);
    when(underscoreRule.validate(password)).thenReturn(true);

    var result = passwordValidator.validate(password);

    assertFalse(result);
  }
}
