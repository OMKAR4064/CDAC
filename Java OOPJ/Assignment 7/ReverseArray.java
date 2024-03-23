public class ReverseArray {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] array = {1, 2, 3, 4, 5};

        // Reverse the array
        reverseArray(array);

        // Print the reversed array
        System.out.println("Reversed Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void reverseArray(int[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            // Swap the elements at i and length - i - 1 indices
            int temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
    }
}
