package lesson07;

public class Lion extends Animal{

    public Lion(String name, int weight, String color) {
        super (name, weight, color);
    }

    @Override
    public void saySomething() {
System.out.println ("rrrrrrrrr");
    }

    @Override
    public void eatSomething() {
        System.out.println ("meat");
    }

    @Override
    public void runSomething() {
        System.out.println ("80 km/hour");
    }

    @Override
    public void sleepSomething() {
        System.out.println ("20 hour/day");
    }

    @Override
    public String toString() {
        return "Lion name is: " + this.getName() + ";" + " weight: " + this.getWeight() + " kg" + ";" + " color: " + this.getColor() + ";";}
}
