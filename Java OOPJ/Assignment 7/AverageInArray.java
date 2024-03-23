public class AverageInArray {
    public static void main(String[] args) {
        int[] array = {5, 14, 35, 89, 140};

        printRunningAverage(array);
    }

    public static void printRunningAverage(int[] array) {
        if (array.length < 3) {
            System.out.println("Input array has fewer than 3 integers.");
            return;
        }

        System.out.print("Output: [");
        for (int i = 0; i <= array.length - 3; i++) {
            int sum = array[i] + array[i + 1] + array[i + 2];
            double average = sum / 3.0;
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print((int) average);
        }
        System.out.println("]");
    }
}
