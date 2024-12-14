package people;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AutomatedEngineerTestNgTest {

    @Test
    public void testConstructorAndProperties() {
        // Create an instance of the concrete TestAutomatedEngineer
        AutomatedEngineer engineer = new AutomatedEngineer(30, 10, 5);

        // Verify the properties inherited from the hierarchy
        assertEquals(30, engineer.getAge(), "Age should match the constructor input");
        assertEquals(15, engineer.getSkill(), "Skill should be experience * 3 (5 * 3)");
        assertEquals(5, engineer.getExperience(), "Experience should match the constructor input");
    }

    @Test
    public void testSettersAndGetters() {
        AutomatedEngineer engineer = new AutomatedEngineer(25, 10, 3);

        // Test setting and getting age
        engineer.setAge(35);
        assertEquals(35, engineer.getAge(), "Age should update correctly");

        // Test setting and getting skill
        engineer.setSkill(20);
        assertEquals(20, engineer.getSkill(), "Skill should update correctly");

        // Test setting and getting experience
        engineer.setExperience(8);
        assertEquals(8, engineer.getExperience(), "Experience should update correctly");
    }
}
