public class Dog extends Animal implements Runnable{

    public Dog(String name, int age, int weight) {
        super(name, age, weight);
    }
public void bark(){
        System.out.println ("Dog is barking....");
}
    @Override
    public void saySomething() {
        System.out.println("hav-hav");
    }

    @Override
    public void eat() {
        System.out.println("Dog eating bones");
    }

    @Override
    public String toString() {
        return "Dog name is: " + this.getName() + ";" + " age: " + this.getAge() + " year" + ";" + " weight: " + this.getWeight() + " kg" + ";";
    }

    @Override
    public int runWithSpeed() {
        return 20;
    }
}