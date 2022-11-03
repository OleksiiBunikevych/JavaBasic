package lesson07;

public class Mouse extends Animal{

    public Mouse(String name, int weight, String color) {
        super (name, weight, color);
    }

    @Override
    public void saySomething() {
        System.out.println ("uh-uh-uhhh");
    }

    @Override
    public void eatSomething() {
        System.out.println ("banan");
    }

    @Override
    public void runSomething() {
        System.out.println ("27 km/hour");
    }

    @Override
    public void sleepSomething() {
        System.out.println ("6 hour/day");
    }

    @Override
    public String toString() {
        return "Mouse name is: " + this.getName() + ";" + " weight: " + this.getWeight() + " kg" + ";" + " color: " + this.getColor() + ";";}
}
