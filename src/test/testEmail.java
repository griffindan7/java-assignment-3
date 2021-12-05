import com.example.loginapplication.validateEmail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testEmail {

    private validateEmail tester;

    @BeforeEach
    public void setUp() {

        tester = new validateEmail();

    }

    @Test
    void toValidateEmail(){

        String formatOfEmail = "daniel@gmail.com";
        boolean isEmailCorrect = tester.test(formatOfEmail);
        Assertions.assertTrue(isEmailCorrect);

    }
}
