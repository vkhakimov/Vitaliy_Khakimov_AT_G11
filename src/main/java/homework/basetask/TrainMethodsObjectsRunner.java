package homework.basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {
        Mouse mouse = new Mouse("Jerry", 21);
        Souse souse = new Souse("Carry", "red");
        Bee bee = new Bee("Male", 5123L);
        Obstacle obstacle = new Obstacle("omg", "high");
        Pineapple pineapple = new Pineapple("South", 2200);

        TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();
        trainMethodsObjects.processMouse(mouse);
        trainMethodsObjects.processSouse(souse);
        trainMethodsObjects.processBee(bee);
        trainMethodsObjects.processObstacle(obstacle);
        trainMethodsObjects.processPineapple(pineapple);
    }
}
