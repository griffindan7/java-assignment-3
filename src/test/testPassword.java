import com.example.loginapplication.validatePassword;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testPassword {

    private validatePassword tester;

    @BeforeEach
    public void setUp() {

        tester = new validatePassword();

    }

    @Test
    void toValidatePassword(){

        String formatOfPassword = "";
        boolean isPasswordCorrect = tester.test(formatOfPassword);
        Assertions.assertTrue(isPasswordCorrect);

    }
}
