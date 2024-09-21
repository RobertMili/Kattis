import java.util.Scanner;

public class ABC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the three integers
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Read the desired order
        String order = scanner.next();

        // Create an array to store the numbers
        int[] numbers = { num1, num2, num3 };

        // Sort the numbers
        java.util.Arrays.sort(numbers);

        // Map the sorted numbers to 'A', 'B', 'C'
        int smallest = numbers[0];
        int middle = numbers[1];
        int largest = numbers[2];

        // Prepare the result based on the desired order
        StringBuilder result = new StringBuilder();
        for (char c : order.toCharArray()) {
            if (c == 'A') {
                result.append(smallest).append(" ");
            } else if (c == 'B') {
                result.append(middle).append(" ");
            } else if (c == 'C') {
                result.append(largest).append(" ");
            }
        }

        // Print the result
        System.out.println(result.toString().trim());

        scanner.close();
    }
}
