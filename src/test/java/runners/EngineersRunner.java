package runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.unit.junit.AutomatedEngineerJunitTest;
import tests.unit.junit.EngineerUnitTest;
import tests.unit.junit.ManualEngineerJunitTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AutomatedEngineerJunitTest.class,
        ManualEngineerJunitTest.class,
        EngineerUnitTest.class
})
public class EngineersRunner {
}
