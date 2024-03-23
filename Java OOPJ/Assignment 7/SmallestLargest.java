public class SmallestLargest {
    public static void main(String[] args) {
        int[] array = {5, 3, 9, 1, 7, 2, 8, 4, 6};

        // Find the smallest and largest numbers in the array
        int smallest = array[0];
        int largest = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        // Print the smallest and largest numbers
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}
