public class Lion extends Animal implements Runnable{

    public Lion(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void saySomething() {
        System.out.println("rrrrrrrrr");
    }

    @Override
    public void eat() {
        System.out.println("Lion eating meat");
    }

    @Override
    public String toString() {
        return "Lion name is: " + this.getName() + ";" + " age: " + this.getAge() + " year" + ";" + " weight: " + this.getWeight() + " kg" + ";";
    }

    @Override
    public int runWithSpeed() {
        return 50;
    }
}
