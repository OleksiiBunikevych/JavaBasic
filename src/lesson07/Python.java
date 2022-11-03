package lesson07;

public class Python extends Animal {
    public Python(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public void saySomething() {
        System.out.println ("ssssssss");
    }

    @Override
    public void eatSomething() {
        System.out.println ("mouse");
    }

    @Override
    public void runSomething() {
        System.out.println ("8 km/hour");
    }

    @Override
    public void sleepSomething() {
        System.out.println ("12 hour/day");
    }

    @Override
    public String toString() {
        return "Python name is: " + this.getName() + ";" + " weight: " + this.getWeight() + " kg" + ";" + " color: " + this.getColor() + ";";}
}

