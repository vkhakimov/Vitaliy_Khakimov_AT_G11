package homework.playground.essence.creatures;

public class Crocodile extends Vertebrata implements Crawlable {
    public Crocodile(int mass, String name) {
        super(mass, name);
    }

    public void crawl(String direction, int distance) {
        System.out.println("I am " + this.getClass().getSimpleName() + ", my name is " + this.getName()
                + " and I amd crawling to " + direction + " for " + distance + " units");
        System.out.println("wr-wr-wrr-r..");
    }
}
