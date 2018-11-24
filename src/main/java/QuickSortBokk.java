import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSortBokk {
    public static List<Integer> quicksort(List<Integer> numbers) {
        if (numbers.size() < 2)
            return numbers;

        Integer pivot = numbers.get(0);
        List<Integer> lower = new ArrayList<>();
        List<Integer> higher = new ArrayList<>();

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < pivot) {
                lower.add(numbers.get(i));
            } else {
                higher.add(numbers.get(i));
            }
        }

        List<Integer> sorted = quicksort(lower);
        sorted.add(pivot);
        sorted.addAll(quicksort(higher));
        return sorted;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,7,9,123,4312,4,23,5,10);
        System.out.println(quicksort(list));
    }
}
