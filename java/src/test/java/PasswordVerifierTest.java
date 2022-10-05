import PasswordVerifier.PasswordVerifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordVerifierTest {

  PasswordVerifier passwordVerifier = new PasswordVerifier();

	@Test
	public void shouldReturnTrueWhenPasswordHasMoreThanEightCharacters() {
    String password = "passwords";

    boolean result = passwordVerifier.verifyMoreThanEightCharacters(password);

		assertTrue(result);
	}

  @Test
  public void shouldReturnFalseWhenPasswordHasEightOrLessCharacters() {
    String password = "password";

    boolean result = passwordVerifier.verifyMoreThanEightCharacters(password);

    assertFalse(result);
  }

  @Test
  public void shouldReturnTrueWhenPasswordHasAtLeastACapitalLetter() {
    String password = "paSsword";

    boolean result = passwordVerifier.verifyCapitalLetter(password);

    assertTrue(result);
  }

  @Test
  public void shouldReturnFalseWhenPasswordHasNotCapitalLetter() {
    String password = "password";

    boolean result = passwordVerifier.verifyCapitalLetter(password);

    assertFalse(result);
  }

  @Test
  public void shouldReturnTrueWhenPasswordHasAtLeastALowerCase() {
    String password = "PASSWORd";

    boolean result = passwordVerifier.verifyLowerCaseLetter(password);

    assertTrue(result);
  }

  @Test
  public void shouldReturnFalseWhenPasswordHasNoLowerCase() {
    String password = "PASSWORD";

    boolean result = passwordVerifier.verifyLowerCaseLetter(password);

    assertFalse(result);
  }

  @Test
  public void shouldReturnTrueWhenPasswordHasAtLeastANumber() {
    String password = "P4SSWORd";

    boolean result = passwordVerifier.verifyContainsANumber(password);

    assertTrue(result);
  }

  @Test
  public void shouldReturnFalseWhenPasswordHasNoNumber() {
    String password = "PASSWORD";

    boolean result = passwordVerifier.verifyContainsANumber(password);

    assertFalse(result);
  }

  @Test
  public void shouldReturnTrueWhenPasswordContainsUnderscore() {
    String password = "P_4SSWORd";

    boolean result = passwordVerifier.verifyContainsUnderscore(password);

    assertTrue(result);
  }

  @Test
  public void shouldReturnFalseWhenPasswordDoesnotContainsUnderscore() {
    String password = "PASSWORD";

    boolean result = passwordVerifier.verifyContainsUnderscore(password);

    assertFalse(result);
  }
}
