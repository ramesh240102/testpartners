import org.junit.Test;

public class TestCheck extends AbstractTest {

    @Test
    public void TestCheckPage() throws InterruptedException {
        System.out.println("Test Check");

        pageNavigator.openHomePage().testHome();
    }
}
