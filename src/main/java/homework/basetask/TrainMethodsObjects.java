package homework.basetask;

public class TrainMethodsObjects {
    public void processMouse(Mouse mouse) {
        System.out.println("Name: " + mouse.getName());
        System.out.println("Age: " + mouse.getAge());
        mouse.printMouseDetails();
    }

    public void processSouse(Souse souse) {
        System.out.println("Name: " + souse.getName());
        System.out.println("Color: " + souse.getColor());
        souse.printSouseDetails();
    }

    public void processBee(Bee bee) {
        System.out.println("Gender: " + bee.getGender());
        System.out.println("Weight: " + bee.getWeight());
        bee.printBeeDetails();
    }

    public void processObstacle(Obstacle obstacle) {
        System.out.println("Description: " + obstacle.getDescription());
        System.out.println("Severity: " + obstacle.getSeverity());
        obstacle.printObstacleDetails();
    }

    public void processPineapple(Pineapple pineapple) {
        System.out.println("Grade: " + pineapple.getGrade());
        System.out.println("Heat capacity: " + pineapple.getHeatCapacity());
        pineapple.printPineappleDetails();
    }
}
