import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        // Simulate input using a Scanner
        String input = "10\n3\n4\n6\n2\n";
        Scanner sc = new Scanner(input);

        int perMonth = sc.nextInt();
        int numberMonths = sc.nextInt();

        int totalMb = perMonth * (numberMonths + 1);

        for (int i = 0; i < numberMonths; i++) {
            totalMb -= sc.nextInt();
        }

        System.out.println(totalMb);
    }
}