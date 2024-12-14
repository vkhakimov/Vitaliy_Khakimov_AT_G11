package people;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ManualEngineerTestNgTest {

    @Test
    public void testConstructorAndProperties() {
        ManualEngineer engineer = new ManualEngineer(25, 10, 5);

        assertEquals(25, engineer.getAge(), "Age should match the constructor input");
        assertEquals(5, engineer.getExperience(), "Experience should match the constructor input");
        assertEquals(10, engineer.getSkill(), "Skill should be experience * 2 (5 * 2)");
    }

    @Test
    public void testSettersAndGetters() {
        ManualEngineer engineer = new ManualEngineer(30, 20, 7);

        engineer.setAge(35);
        assertEquals(35, engineer.getAge(), "Age should update correctly");

        engineer.setSkill(50);
        assertEquals(50, engineer.getSkill(), "Skill should update correctly");

        engineer.setExperience(15);
        assertEquals(15, engineer.getExperience(), "Experience should update correctly");
    }
}
