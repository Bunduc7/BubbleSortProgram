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
        // Display the array before sorting
        System.out.print("Array before sorting: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // Move to the next line
        // Initialize swap count
        int swapCount = 0;

        // Perform Bubble Sort
        for (int i = 0; i < size - 1; i++) {
            boolean swapped = false; // Flag to check if a swap occurred

            for (int j = 0; j < size - 1 - i; j++) {
                // Compare adjacent elements
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapCount++; // Increment swap count
                    swapped = true; // Set flag to true
                }
            }

            // If no swaps occurred in the inner loop, the array is sorted
            if (!swapped) {
                break; // Exit the outer loop early
            }
        }
        // Display the array after sorting
        System.out.print("Array after sorting: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // Move to the next line

        // Display the total number of swaps performed
        System.out.println("Total number of swaps: " + swapCount);
    }
}
