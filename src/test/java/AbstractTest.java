import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import report.ScreenShotCapture;
import testpartner.commons.InitialConfig;
import testpartner.commons.PageNavigator;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = InitialConfig.class, loader = AnnotationConfigContextLoader.class)
public abstract class AbstractTest {

    @Autowired
    protected PageNavigator pageNavigator;

    @Autowired
    public ScreenShotCapture screenShotCapture;

}
