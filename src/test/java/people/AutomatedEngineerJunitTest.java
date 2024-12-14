package people;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AutomatedEngineerJunitTest {

    @Test
    public void testConstructorAndProperties() {
        AutomatedEngineer engineer = new AutomatedEngineer(30, 10, 5);

        assertEquals(30, engineer.getAge());
        assertEquals(15, engineer.getSkill());
        assertEquals(5, engineer.getExperience());
    }

    @Test
    public void testSettersAndGetters() {
        AutomatedEngineer engineer = new AutomatedEngineer(25, 10, 3);

        engineer.setAge(35);
        assertEquals(35, engineer.getAge());

        engineer.setSkill(20);
        assertEquals(20, engineer.getSkill());

        engineer.setExperience(8);
        assertEquals(8, engineer.getExperience());
    }
}
