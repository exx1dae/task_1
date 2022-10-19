public class task_1_8 {
    public static void main(String[] args) {
        System.out.print(nextEdge(5, 7));
    }

    public static int nextEdge(int side_1, int side_2) {
        return (side_1 + side_2) - 1;
    }
}
