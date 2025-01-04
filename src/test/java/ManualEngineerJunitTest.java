import org.junit.Test;
import people.ManualEngineer;

import static org.junit.Assert.assertEquals;


public class ManualEngineerJunitTest {

    @Test
    public void testAge() {
        ManualEngineer engineer = new ManualEngineer(25, 10, 5);

        assertEquals(25, engineer.getAge());
    }

    @Test
    public void testSkill() {
        ManualEngineer engineer = new ManualEngineer(25, 10, 5);

        assertEquals(10, engineer.getSkill());
    }

    @Test
    public void testExperience() {
        ManualEngineer engineer = new ManualEngineer(25, 10, 5);

        assertEquals(5, engineer.getExperience());
    }

    @Test
    public void testAgeSetterGetter() {
        ManualEngineer engineer = new ManualEngineer(30, 20, 7);

        engineer.setAge(35);
        assertEquals(35, engineer.getAge());
    }

    @Test
    public void testSkillSetterGetter() {
        ManualEngineer engineer = new ManualEngineer(30, 20, 7);

        engineer.setSkill(50);
        assertEquals(50, engineer.getSkill());
    }

    @Test
    public void testExperienceSetterGetter() {
        ManualEngineer engineer = new ManualEngineer(30, 20, 7);
        engineer.setExperience(15);
        assertEquals(15, engineer.getExperience());
    }
}
