import java.util.Arrays;
import java.util.List;

public class RecursionListSum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(listSum(list));

    }

    public static Integer listSum(List<Integer> list) {
        if (list.size() == 0)
            return 0;
        if (list.size() == 1)
            return list.get(0);
        return 0;
    }
}
