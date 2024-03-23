import java.util.*;

public class ArrayMerge {
    public static void main(String[] args) {
        int[] array1 = {23, 60, 94, 3, 102};
        int[] array2 = {42, 16, 74};

        int[] mergedArray = mergeArrays(array1, array2);

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int index1 = 0;
        int index2 = 0;
        int[] mergedArray = new int[array1.length + array2.length];
        int mergedIndex = 0;

        while (index1 < array1.length && index2 < array2.length) {
            mergedArray[mergedIndex++] = array1[index1++];
            mergedArray[mergedIndex++] = array2[index2++];
        }

        // Concatenate remaining elements from array1
        while (index1 < array1.length) {
            mergedArray[mergedIndex++] = array1[index1++];
        }

        // Concatenate remaining elements from array2
        while (index2 < array2.length) {
            mergedArray[mergedIndex++] = array2[index2++];
        }

        return mergedArray;
    }
}
