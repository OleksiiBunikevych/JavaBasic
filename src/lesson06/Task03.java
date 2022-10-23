package lesson06;

public class Task03 {
    public static void main(String[] args) {
        Dog CaneCorso = new Dog("Malysh", 4, 75.5f, "blaсk");
        String dogline1 = CaneCorso.getValues();
        System.out.println(dogline1);
        Dog GermanShepherd = new Dog("Rex", 2, 45.5f, "gray");
        String dogline2 = GermanShepherd.getValues();
        System.out.println(dogline2);

    }
}