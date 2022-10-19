public class task_1_9 {
    public static void main(String[] args) {
        int sumofcube = sumOfCubes(new int[] {1, 5, 9});
        System.out.print(sumofcube);
    }

    public static int sumOfCubes(int[] Array) {
        int sum = 0;
        for (int j : Array) {
            sum += Math.pow(j, 3);
        }
        return sum;
    }
}
