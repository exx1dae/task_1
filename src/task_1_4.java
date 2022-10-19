import java.util.Scanner;

public class task_1_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 3 переменные: ");
        double prob = in.nextDouble();
        double prize = in.nextDouble();
        double pay = in.nextDouble();
        System.out.printf("Prob - %f \nPrize - %f \nPay - %f \n", prob, prize, pay);
        System.out.print(profitableGamble(prob, prize, pay));
    }

    public static boolean profitableGamble(double prob, double prize, double pay) {
        return prob * prize > pay;
    }
}
