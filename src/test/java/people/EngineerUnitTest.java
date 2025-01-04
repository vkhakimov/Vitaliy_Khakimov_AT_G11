package people;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EngineerUnitTest {
    @Parameterized.Parameter()
    public Engineer engineer;

    @Parameterized.Parameter(1)
    public int expectedSkill;

    @Parameterized.Parameters
    public static Collection<Object[]> engineers() {
        return Arrays.asList(new Object[][]{
                {new ManualEngineer(18, 5, 5), 5},
                {new AutomatedEngineer(18, 5, 5), 15}
        });
    }

    @Test
    public void getAgeTest() {
        assertEquals("The age is wrong", 18, engineer.getAge());
    }

    @Test
    public void getSkillTest() {
        assertEquals("The skill is wrong", expectedSkill, engineer.getSkill());
    }

    @Test
    public void getExperienceTest() {
        assertEquals("The experience is wrong", 5, engineer.getExperience());
    }

    @Test
    public void setAgeTest() {
        engineer.setAge(99);
        assertEquals("The age is wrong", 99, engineer.getAge());
    }

    @Test
    public void setSkillTest() {
        engineer.setSkill(45);
        assertEquals("The skill is wrong", 45, engineer.getSkill());
    }

    @Test
    public void SetExperienceTest() {
        engineer.setExperience(9);
        assertEquals("The experience is wrong", 9, engineer.getExperience());
    }
}
