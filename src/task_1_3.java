import java.util.Scanner;

public class task_1_3 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите кол - во животных каждого вида: ");
            int chickens = in.nextInt();
            int cows = in.nextInt();
            int pigs= in.nextInt();
            System.out.printf("Chickens - %d \nCows - %d \nPigs - %d \n", chickens,cows, pigs);
            System.out.print("Сумма всех ног - " + animals(chickens, cows, pigs));
        }
        public static int animals (int chickens, int cows, int pigs) {
            int Sum;
            chickens = chickens * 2;
            cows = cows * 4;
            pigs = pigs * 4;
            Sum = chickens + cows + pigs;
            return Sum;
        }
}
