public class Crucian extends Animal implements Swim{

    public Crucian (String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void saySomething() {
        System.out.println("krrrrr");
    }

    @Override
    public void eat() {
        System.out.println("Crucian eating plankton");
    }

    @Override
    public String toString() {
        return "Crucian name is: " + this.getName() + ";" + " age: " + this.getAge() + " year" + ";" + " weight: " + this.getWeight() + " gram" + ";";
    }

    @Override
    public int swimWithSpeed() {
        return 5;
    }
}