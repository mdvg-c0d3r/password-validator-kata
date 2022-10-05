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
  public void shouldReturnTrueWhenPasswordHasCapitalLetter() {
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
}
