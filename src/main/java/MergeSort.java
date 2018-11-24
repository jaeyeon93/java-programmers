import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static List<Integer> mergeSort(List<Integer> values) {
        if (values.size() < 2)
            return values;
        List<Integer> leftHalf = values.subList(0, values.size()/2);
        List<Integer> rightHalf = values.subList(values.size()/2, values.size());

        return merge(mergeSort(leftHalf), mergeSort(rightHalf));
    }

    private static List<Integer> merge(List<Integer> leftHalf, List<Integer> rightHalf) {
        int leftPtr = 0;
        int rightPtr = 0;

        List<Integer> merged = new ArrayList<>(leftHalf.size() + rightHalf.size());

        while (leftPtr < leftHalf.size() && rightPtr < rightHalf.size()) {
            if (leftHalf.get(leftPtr) < rightHalf.get(rightPtr)) {
                merged.add(leftHalf.get(leftPtr));
                leftPtr++;
            } else {
                merged.add(rightHalf.get(rightPtr));
                rightPtr++;
            }
        }

        while (leftPtr < leftHalf.size()) {
            merged.add(leftHalf.get(leftPtr));
            leftPtr++;
        }

        while (rightPtr < rightHalf.size()) {
            merged.add(rightHalf.get(rightPtr));
            rightPtr++;
        }

        return merged;
    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,55,632,123,4567,9,4,17,132,45,7890,10000,33,2,0);
        System.out.println(mergeSort(list));
    }
}
