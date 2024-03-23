import java.util.*;

public class FindPairsWithSum {
    public static void main(String[] args) {
        int[] array = {2, 4, 3, 5, 7, 8, 9};
        int targetSum = 7;

        findPairsWithSum(array, targetSum);
    }

    public static void findPairsWithSum(int[] array, int targetSum) {
        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int num : array) {
            int complement = targetSum - num;
            if (map.containsKey(complement)) {
                List<Integer> pair = new ArrayList<>();
                pair.add(num);
                pair.add(complement);
                result.add(pair);
            }
            map.put(num, num);
        }

        if (result.isEmpty()) {
            System.out.println("No pairs found with the given sum.");
        } else {
            System.out.println("Pairs with sum " + targetSum + ":");
            for (List<Integer> pair : result) {
                System.out.println(pair.get(0) + ", " + pair.get(1));
            }
        }
    }
}
