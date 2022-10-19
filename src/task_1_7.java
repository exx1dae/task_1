public class task_1_7 {
    public static void main(String[] args) {
        System.out.print(addUpTo(3));
    }
    public static int addUpTo(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        return sum;
    }
}
