package lesson07;

public class Horse extends Animal {
    public Horse(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public void saySomething() {
        System.out.println ("rrrrrrrrr");
    }

    @Override
    public void eatSomething() {
        System.out.println ("grass");
    }

    @Override
    public void runSomething() {
        System.out.println ("81 km/hour");
    }

    @Override
    public void sleepSomething() {
        System.out.println ("3-4 hour/day");
    }

    @Override
    public String toString() {
        return "Horse name is: " + this.getName() + ";" + " weight: " + this.getWeight() + " kg" + ";" + " color: " + this.getColor() + ";";}
}
