import java.util.Scanner;

public class task_1_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите символ который хотите преобразовать - ");
        char symbol = in.next().charAt(0);
        System.out.print( (ctoa(symbol)));
    }

    public static int ctoa(char symbol) {
        return symbol;
    }
}
