package people;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ManualEngineerJunitTest {

    @Test
    public void testConstructorAndProperties() {
        ManualEngineer engineer = new ManualEngineer(25, 10, 5);

        assertEquals(25, engineer.getAge());
        assertEquals(5, engineer.getExperience());
        assertEquals(10, engineer.getSkill());
    }

    @Test
    public void testSettersAndGetters() {
        ManualEngineer engineer = new ManualEngineer(30, 20, 7);

        engineer.setAge(35);
        assertEquals(35, engineer.getAge());

        engineer.setSkill(50);
        assertEquals(50, engineer.getSkill());

        engineer.setExperience(15);
        assertEquals(15, engineer.getExperience());
    }
}
