package lesson02;
import java.util.Scanner;
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//summa masyvu dannych;
        int arrayInt[] = {0, 1, 2, 1_000_000, 01, 02, 03, 0377, 0b1, 0b10, 0x10, 0xFF_FF};
        byte arrayByte[] = {15, 16, 85, 126, 89, 78, 97, -35, 0};
        double arrayDouble[] = {34.34, .123, 1E3, 1e3, 123., 1e-2, 123D, 12.12e-2D, 123d, 0x12P2, 0X12.4p2, 0xFP-2};
        long[] arrayLong = {0L, 1L, 2L, 1_000_000L, 01L, 02L, 03L, 0377L, 0b1L, 0b10L, 0x10L, 0xFF_FF};
        short arrayShort[] = {15, 16, 85, 126, 89, 78, 97, -35, 0};
        float arrayFloat[] = {34.34f, 1E3f, .123f, 1e3f, 123.f, 1e-2f, 123F, 12.12e-2F, 123f, 0x12P2F, 0X12.4p2f, 0xFP-2F};
        char arrayChar[] = {'f', 'ж', '\u0061', '\u0436', '\n', '\r', '\t', '\12', '\377'};
        int sumInt = 0, sumByte = 0, sumDouble = 0, sumLong = 0, sumShort = 0, sumFloat = 0, sumChar = 0;
        long result;
        for (int i = 0; i < arrayInt.length; i++)
            sumInt += arrayInt[i];
        for (int i = 0; i < arrayByte.length; i++)
            sumByte += arrayByte[i];
        for (int i = 0; i < arrayDouble.length; i++)
            sumDouble += arrayDouble[i];
        for (int i = 0; i < arrayLong.length; i++)
            sumLong += arrayLong[i];
        for (int i = 0; i < arrayShort.length; i++)
            sumShort += arrayShort[i];
        for (int i = 0; i < arrayFloat.length; i++)
            sumFloat += arrayFloat[i];
        for (int i = 0; i < arrayChar.length; i++)
            sumChar += arrayChar[i];
        System.out.println("========================");
        System.out.println("sumInt=" + sumInt + "; " + "sumByte=" + sumByte + "; " + "sumDouble=" + sumDouble + "; "
                + "sumLong=" + sumLong + "; " + "sumShort=" + sumShort + "; " + "sumFloat=" + sumFloat + "; "
                + "sumChar=" + sumChar + "; ");
        result = sumInt + sumByte + sumDouble + sumLong + sumShort + sumFloat + sumChar;
        System.out.println("result=" + result);
        System.out.println("========================");
    }
}

