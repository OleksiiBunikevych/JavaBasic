public abstract class Animal {

    private String name;
    private int age;
    private int weight;

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public abstract void saySomething();

    //public abstract void eatSomething();

    public abstract String toString();

    public void eat() {
        System.out.println("Animal is eating...");
    }

}
