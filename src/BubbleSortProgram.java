import java.util.Scanner; // Import Scanner for user input

public class BubbleSortProgram { // Main class definition
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
    }
}
        // Accept the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt(); // Read the array size

        // Initialize the array
        int[] array = new int[size];

        // Accept the elements of the array
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt(); // Read each element
        }
