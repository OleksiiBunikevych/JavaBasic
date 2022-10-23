package lesson06;

public class Task03 {
    public static void main(String[] args) {
        Dog CaneCorso = new Dog();
        CaneCorso.setValues("Malysh", 4, 75.5f, "blaсk");
        String dogline1 = CaneCorso.getValues();
        System.out.println(dogline1);
        Dog GermanShepherd = new Dog();
        GermanShepherd.setValues("Rex", 2, 45.5f, "gray");
        String dogline2 = GermanShepherd.getValues();
        System.out.println(dogline2);

    }
}