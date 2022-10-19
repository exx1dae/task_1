import java.util.Scanner;

public class task_1_5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите числа N, a, b в соответствующем порядке: ");
        int N = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.printf("N - %d\na - %d\nb - %d\n", N, a, b);
        System.out.printf(operation(N, a, b));
    }

    public static String operation(int N, int a, int b) {
        try {
            if (a + b == N) {
                return "added";
            }
            else if ((a - b == N) | (b - a == N)) {
                return "subtracted";
            }
            else if (a * b == N) {
                return "multiplied";
            }
            else if ( ( (a / b == N) & (a % b == 0) ) | ( (b / a == N) & (b % a == 0) ) ) {
                return "division";
            }
            else
                return "none";
        }
        catch (ArithmeticException exception){
            return "none";
        }

    }
}
