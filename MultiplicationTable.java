import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the multiplication table
        System.out.print("Enter the size of the multiplication table: ");
        int size = scanner.nextInt();

        // Declare a two-dimensional array to store multiplication results
        int[][] multiplicationTable = new int[size][size];

        // Populate the array using nested loops
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        // Print the multiplication table with formatting
        System.out.println("\nMultiplication Table:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Use printf to format each number to take up at least 4 spaces
                System.out.printf("%4d", multiplicationTable[i][j]);
            }
            System.out.println();  // Move to the next line after printing each row
        }

        scanner.close();
    }
}
