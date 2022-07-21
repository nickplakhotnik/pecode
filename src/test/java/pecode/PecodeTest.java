package pecode;

import org.testng.annotations.Test;

public class PecodeTest extends BaseTest {

    @Test
    public void pecodeTest() {
        logger.info("1. Login test");
        LoginSteps.loginStep(user);
    }
}
