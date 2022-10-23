package lesson06;

public class Dog {
    private String name;
    private int age;
    private float weight;
    private String color;

    public Dog (String name, int age, float weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public String getValues() {
        String info = "Dog name: " + name + "; age: " + age + "; weight: " + weight + "; color: " + color + ".";
        return info;
    }
}
