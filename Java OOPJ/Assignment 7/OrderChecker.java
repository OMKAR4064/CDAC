public class OrderChecker {
    public static void main(String[] args) {
        int[] array1 = {5, 14, 35, 90, 139};
        int[] array2 = {88, 67, 35, 14, -12};
        int[] array3 = {65, 14, 129, 34, 7};

        printOrder(array1);
        printOrder(array2);
        printOrder(array3);
    }

    public static void printOrder(int[] array) {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                descending = false;
            } else if (array[i] > array[i + 1]) {
                ascending = false;
            }
        }

        if (ascending && !descending) {
            System.out.println("Ascending");
        } else if (descending && !ascending) {
            System.out.println("Descending");
        } else {
            System.out.println("Random");
        }
    }
}
