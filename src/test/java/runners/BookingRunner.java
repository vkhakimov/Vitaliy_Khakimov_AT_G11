package runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.ui.junit.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BookingTooltipsTest.class,
        BookingParisTest.class,
        BookingLondonTest.class,
        DemoQaTest.class,
        TutorialTest.class
})
public class BookingRunner {
}
