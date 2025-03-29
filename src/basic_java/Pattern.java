public class Pattern {
    public static void main(String[] args) {
        int n = 5;

        // Inverred Star Pattern
        // for (int line = 1; line <= n; line++) {
        // for (int i = 1; i <= n - line + 1; i++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Half Pyramid Pattern
        // 1
        // 12
        // 123
        // 1234
        // 12345
        for (int line = 1; line <= n; line++) {
            for (int i = 1; i <= line; i++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
