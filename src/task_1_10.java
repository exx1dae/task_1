public class task_1_10 {
    public static void main(String[] args) {
        System.out.println(abcmath(42, 5, 10));
    }
    public static boolean abcmath(int a, int b, int c) {
        while (b != 0) {
            a += a;
            b = b - 1;
        }
        return a % c == 0;
    }
}
