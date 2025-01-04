import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import people.AutomatedEngineer;
import people.Engineer;
import people.ManualEngineer;

import static org.testng.Assert.assertEquals;

public class EngineerTestNG {
    @DataProvider(name = "engineer")
    public Object[][] provideEngineer() {
        return new Object[][]{
                {new ManualEngineer(18, 5, 15), 30},
                {new AutomatedEngineer(18, 5, 15), 45}
        };
    }

    @Test(dataProvider = "engineer")
    public void testGetAge(Engineer en, int expectedSkill) {
        assertEquals(en.getAge(), 18, "The age is wrong");
    }

    @Test(dataProvider = "engineer")
    public void testGetSkill(Engineer en, int expectedSkill) {
        assertEquals(en.getSkill(), expectedSkill, "The skill is wrong");
    }

    @Test(dataProvider = "engineer")
    public void testGetExperience(Engineer en, int expectedSkill) {
        assertEquals(en.getExperience(), 15, "The experience is wrong");
    }

    @Test(dataProvider = "engineer")
    public void testSetAge(Engineer en, int expectedSkill) {
        en.setAge(30);
        assertEquals(en.getAge(), 30, "The age is wrong");
    }

    @Test(dataProvider = "engineer")
    public void testSetSkill(Engineer en, int expectedSkill) {
        en.setSkill(4);
        assertEquals(en.getSkill(), 4, "The skill is wrong");
    }

    @Test(dataProvider = "engineer")
    public void testSetExperience(Engineer en, int expectedSkill) {
        en.setExperience(4);
        assertEquals(en.getExperience(), 4, "The experience is wrong");
    }
}
