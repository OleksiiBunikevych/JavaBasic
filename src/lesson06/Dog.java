package lesson06;

public class Dog {
    private String name;
    private int age;
    private float weight;
    private String color;

    public Dog(String name, int age, float weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Dog name: " + name + "; age: " + age + "; weight: " + weight + "; color: " + color + ".";
    }
}
