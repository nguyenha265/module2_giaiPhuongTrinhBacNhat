import java.util.Scanner;

public class giaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        float a = scanner.nextFloat();

        System.out.println("b = ");
        float b = scanner.nextFloat();

        System.out.println("c = ");
        float c = scanner.nextFloat();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
