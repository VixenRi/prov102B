import java.util.Scanner;

public class Chislo {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите 5 чисел:");
        float[] m = new float[5];
        m[0] = scaner.nextFloat();
        m[1] = scaner.nextFloat();
        m[2] = scaner.nextFloat();
        m[3] = scaner.nextFloat();
        m[4] = scaner.nextFloat();

        System.out.println(Math.min(Math.min(Math.min(m[0], m[1]), Math.min(m[2], m[3])), m[4]));
    }
}


