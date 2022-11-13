public class Task02 {

    public static void main(String[] args) {
//        Animal[] arr = new Animal[]{new(), new Dog(), new Dove(), new Crucian()};
//        for (int i = 0; i <= arr.length; i++)
//            arr[i].eat();

        Cat cat = new Cat("Tom", 5, 3);
        System.out.println(cat.toString());
        cat.saySomething();
        System.out.println(cat.runWithSpeed());
        System.out.println();

        Dog dog = new Dog("Jack", 20, 2);
        System.out.println(dog.toString());
        dog.saySomething();
        dog.bark();
        System.out.println(dog.runWithSpeed());
        System.out.println();

        Dove dove = new Dove("Blanche", 2, 200);
        System.out.println(dove.toString());
        dove.saySomething();
        System.out.println(dove.flyWithSpeed());
        System.out.println();

        Crucian crucian = new Crucian("Nemo", 1, 350);
        System.out.println(crucian.toString());
        crucian.saySomething();
        System.out.println(crucian.swimWithSpeed());
        System.out.println();

        Lion lion = new Lion("King", 7, 190);
        System.out.println(lion.toString());
        lion.saySomething();
        System.out.println(lion.runWithSpeed());


    }
}

