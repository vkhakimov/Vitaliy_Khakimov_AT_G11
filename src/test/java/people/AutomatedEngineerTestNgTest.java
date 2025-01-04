package people;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AutomatedEngineerTestNgTest {

    @Test
    public void testAge() {
        AutomatedEngineer engineer = new AutomatedEngineer(30, 10, 5);
        assertEquals(30, engineer.getAge(), "Age should match the constructor input");
    }

    @Test
    public void testSkill() {
        AutomatedEngineer engineer = new AutomatedEngineer(30, 10, 5);
        assertEquals(15, engineer.getSkill(), "Skill should match the constructor input");
    }

    @Test
    public void testExperience() {
        AutomatedEngineer engineer = new AutomatedEngineer(30, 10, 5);
        assertEquals(5, engineer.getExperience(), "Experience should match the constructor input");
    }

    @Test
    public void testSetAge() {
        AutomatedEngineer engineer = new AutomatedEngineer(30, 10, 5);
        engineer.setAge(35);
        assertEquals(35, engineer.getAge(), "Age should match the constructor input");
    }

    @Test
    public void testSetSkill() {
        AutomatedEngineer engineer = new AutomatedEngineer(30, 10, 5);
        engineer.setSkill(20);
        assertEquals(20, engineer.getSkill(), "Skill should match the constructor input");
    }

    @Test
    public void testSetExperience() {
        AutomatedEngineer engineer = new AutomatedEngineer(30, 10, 5);
        engineer.setExperience(8);
        assertEquals(8, engineer.getExperience(), "Experience should match the constructor input");
    }
}
