package homework.playground.essence.creatures;

public class Beetle extends Insect implements Crawlable {
    public Beetle(int mass, String name) {
        super(mass, name);
    }

    public void nest(Carrot home) {
        double familyMembers = (double) (this.getMass() / home.getMass());
        if (this.getMass() < home.getMass()) {
            System.out.println(String.format("I am %s and I will nest there with %s my family members!", name, familyMembers));
        } else {
            System.out.println("This carrot is too small for nesting :(");
        }
    }

    public void crawl(String direction, int distance) {
        System.out.println("I am " + this.getClass().getSimpleName() + ", my name is " + this.getName()
                + " and I amd crawling to " + direction + " for " + distance + " units");
        System.out.println("vz-vz-vzz-zz..");
    }
}
