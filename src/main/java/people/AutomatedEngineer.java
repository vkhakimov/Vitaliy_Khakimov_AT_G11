package people;

public class AutomatedEngineer extends Engineer {
    public AutomatedEngineer(int age, int experience) {
        super(age, experience * 3, experience);
    }
}
