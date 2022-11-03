package lesson07;

public class Task02 {
    public static void main(String[] args) {
        Lion lion = new Lion("King", 190, "gold");
        System.out.println(lion.toString());
        lion.saySomething();
        lion.eatSomething();
        lion.runSomething();
        lion.sleepSomething();
        System.out.println();
        Mouse mouse = new Mouse("Mickey", 50, "black");
        System.out.println(mouse.toString());
        mouse.saySomething();
        mouse.eatSomething();
        mouse.runSomething();
        mouse.sleepSomething();
        System.out.println();

        Horse horse = new Horse("Amber", 300, "white");
        System.out.println(horse.toString());
        horse.saySomething();
        horse.eatSomething();
        horse.runSomething();
        horse.sleepSomething();
        System.out.println();

        Python python = new Python("Nick", 90, "grey");
        System.out.println(python.toString());
        python.saySomething();
        python.eatSomething();
        python.runSomething();
        python.sleepSomething();

    }
}

