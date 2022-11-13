public class Dove extends Animal implements Fly{

    public Dove(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void saySomething() {
        System.out.println("chkuuuu");
    }

    @Override
    public void eat() {
        System.out.println("Dove eating grain");
    }

    @Override
    public String toString() {
        return "Dove name is: " + this.getName() + ";" + " age: " + this.getAge() + " year" + ";" + " weight: " + this.getWeight() + " gram" + ";";
    }

    @Override
    public int flyWithSpeed() {
        return 15;
    }
}