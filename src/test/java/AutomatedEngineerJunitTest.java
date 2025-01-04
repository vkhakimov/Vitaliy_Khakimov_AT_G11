import org.junit.Test;
import people.AutomatedEngineer;

import static org.junit.Assert.assertEquals;

public class AutomatedEngineerJunitTest {

    @Test
    public void testAge() {
        AutomatedEngineer engineer = new AutomatedEngineer(30, 10, 5);

        assertEquals(30, engineer.getAge());
    }

    @Test
    public void testSkill() {
        AutomatedEngineer engineer = new AutomatedEngineer(30, 10, 5);

        assertEquals(15, engineer.getSkill());
    }

    @Test
    public void testExperience() {
        AutomatedEngineer engineer = new AutomatedEngineer(30, 10, 5);

        assertEquals(5, engineer.getExperience());
    }

    @Test
    public void testAgeSetterGetter() {
        AutomatedEngineer engineer = new AutomatedEngineer(25, 10, 3);

        engineer.setAge(35);
        assertEquals(35, engineer.getAge());
    }

    @Test
    public void testSkillSetterGetter() {
        AutomatedEngineer engineer = new AutomatedEngineer(25, 10, 3);

        engineer.setSkill(20);
        assertEquals(20, engineer.getSkill());
    }

    @Test
    public void testExperienceSetterGetter() {
        AutomatedEngineer engineer = new AutomatedEngineer(25, 10, 3);
        engineer.setExperience(8);
        assertEquals(8, engineer.getExperience());
    }
}
