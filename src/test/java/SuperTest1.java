import org.junit.Test;

import java.util.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class SuperTest1 {

    @Test
    public void 집합이정상적으로만들어지는() {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 1; i <= 300; i++) {
            if (i % 6 == 0) list1.add(i);
            if (i % 8 == 0) list1.add(i);
        }
        TreeSet<Integer> set = new TreeSet<>(list1);
        System.out.println(set);
        Iterator<Integer> itr = set.iterator();
        int count = 0;
        int result = 0;
        while (itr.hasNext()) {
            int num = itr.next();
            count++;
            if (count == 8) {
                result = num;
                break;
            }
        }
        assertThat(result, is(32));
    }
}
