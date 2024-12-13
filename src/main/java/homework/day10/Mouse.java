package homework.day10;

public class Mouse {
    private String pattern;
    private String name;

    public Mouse(int number) {
        this.name = "Mouse <" + number + ">";
    }

    public void peep() throws InterruptedException {
        System.out.println(name + " PEEP");
        Thread.sleep(200);
    }
}
