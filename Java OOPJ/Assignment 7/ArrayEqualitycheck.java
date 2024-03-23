import java.util.Arrays;

public class ArrayEqualitycheck {
    public static void main(String[] args) {
        // Declare and initialize two arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        // Check if the arrays are equal
        boolean areEqual = Arrays.equals(array1, array2);

        // Print the result
        if (areEqual) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }
    }
}
