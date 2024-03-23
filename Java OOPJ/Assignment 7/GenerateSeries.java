public class GenerateSeries {
    public static void main(String[] args) {
        int[] series = generateSeries(6); // Generating the first 6 elements of the series

        System.out.print("Series: ");
        for (int num : series) {
            System.out.print(num + " ");
        }
    }

    public static int[] generateSeries(int length) {
        int[] series = new int[length];
        int count = 1;
        int index = 0;

        while (index < length) {
            if (count % 2 == 1) {
                // Odd count: Cube of count
                series[index] = count * count * count;
            } else {
                // Even count: Square of count
                series[index] = count * count;
            }
            count++;
            index++;
        }

        return series;
    }
}


