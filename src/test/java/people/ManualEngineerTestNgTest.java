package people;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ManualEngineerTestNgTest {

    @Test
    public void testAge() {
        ManualEngineer engineer = new ManualEngineer(30, 10, 5);
        assertEquals(30, engineer.getAge(), "Age should match the constructor input");
    }

    @Test
    public void testSkill() {
        ManualEngineer engineer = new ManualEngineer(30, 10, 5);
        assertEquals(10, engineer.getSkill(), "Skill should match the constructor input");
    }

    @Test
    public void testExperience() {
        ManualEngineer engineer = new ManualEngineer(30, 10, 5);
        assertEquals(5, engineer.getExperience(), "Experience should match the constructor input");
    }

    @Test
    public void testSetAge() {
        ManualEngineer engineer = new ManualEngineer(30, 10, 5);
        engineer.setAge(35);
        assertEquals(35, engineer.getAge(), "Age should match the constructor input");
    }

    @Test
    public void testSetSkill() {
        ManualEngineer engineer = new ManualEngineer(30, 10, 5);
        engineer.setSkill(50);
        assertEquals(50, engineer.getSkill(), "Skill should match the constructor input");
    }

    @Test
    public void testSetExperience() {
        ManualEngineer engineer = new ManualEngineer(30, 10, 5);
        engineer.setExperience(15);
        assertEquals(15, engineer.getExperience(), "Experience should match the constructor input");
    }
}
