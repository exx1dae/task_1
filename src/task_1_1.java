import java.util.Scanner;

public class task_1_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите делимое: ");
        int a = in.nextInt();
        System.out.println("Делимое " + a);
        System.out.print("Введите делитель: ");
        int b = in.nextInt();
        System.out.println("Делитель " + b);
        if (remainder(a,b) == 0) {
            System.out.print("Остаток от деления: " + remainder(a, b));
        }
        else System.out.print("Остаток от деления: " + remainder(a, b) + " != 0");
    }

    public static int remainder(int a, int b) {
        int c;
        c = a % b;
        return c;
    }
}