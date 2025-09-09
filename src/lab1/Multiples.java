package lab1;

public class Multiples {
    public static int multiples(int n, int a, int b) {
        int x = ((n - 1) / a);
        int y = ((n - 1) / b);
        int z = ((n - 1) / (a * b));
        return x + y - z;
    }

    private static int multiples() {
        int x = (999 / 3);
        int y = (999 / 5);
        int z = (999 / (3 * 5));
        return x + y - z;
    }

    public static void main(String[] args) {
        int count = multiples(1000, 3, 5);
        System.out.println(count);
    }
}
