package lesson03;

public class Task07 {
    public static void main(String[] args) {
        float x2 = 2, x1 = 45, y2 = 1, y1 = 9, z2=85, z1=94;
        double distanse = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)+ Math.pow(z2 - z1, 2));
        System.out.println(distanse);
    }
}