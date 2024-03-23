public class ThirdLargetNumber {
    public static void main(String[] args) {
        int[] array = {24, 54, 31, 16, 82, 45, 67};

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = num;
            } else if (num > thirdLargest && num != secondLargest && num != firstLargest) {
                thirdLargest = num;
            }
        }

        if (thirdLargest != Integer.MIN_VALUE) {
            System.out.println("Third Largest number: " + thirdLargest);
        } else {
            System.out.println("No third largest number found.");
        }
    }
}
