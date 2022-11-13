public class Cat extends Animal implements Runnable {

    public Cat(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void saySomething() {
        System.out.println("myauuuu");
    }

    @Override
    public void eat() {
        System.out.println("Cat eating milk");
    }

    @Override
    public String toString() {
        return "Cat name is: " + this.getName() + ";" + " age: " + this.getAge() + " year" + ";" + " weight: " + this.getWeight() + " kg" + ";";
    }

    @Override
    public int runWithSpeed() {
        return 5;
    }
}