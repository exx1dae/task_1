import java.util.Scanner;

public class task_1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите основание: ");
        double b = in.nextDouble();
        System.out.println("Основание " + b);
        System.out.print("Введите высоту: ");
        double h = in.nextDouble();
        System.out.println("Высота: " + h);
        System.out.print("Площадь треугольника: " + triArea(b, h));
    }
    public static double triArea(double b, double h){
        double S;
        S = (b * h) / 2;
        return S;
    }
}
