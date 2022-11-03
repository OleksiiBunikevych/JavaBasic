package lesson07;

public abstract class Animal {
    private String name;
    private int weight;
    private String color;

    public Animal(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }
    public String getColor() {
        return color;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void saySomething();

    public abstract void eatSomething();

    public abstract void runSomething();

    public abstract void sleepSomething();

    public abstract String toString();

}
