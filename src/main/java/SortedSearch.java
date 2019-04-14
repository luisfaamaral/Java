import java.util.Arrays;

public class SortedSearch {
    public static int countNumbers(int[] sortedArray, int lessThan) {
        return (int) Arrays.stream(sortedArray).boxed().filter(i -> i < lessThan).count();
    }

    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[] { 2, 3, 5, 7 }, 4));
    }
}