import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class ZamTest {
    private ZamCalculator test;
    private List<Integer> list = new ArrayList<>();

    @Before
    public void setUp() {
        Random random = new Random();
        for (int i = 0; i < 1000000; i++)
            list.add(random.nextInt());
        test = new ZamCalculator(list);
    }

    @Test
    public void existTest() {
        assertThat(list.size(), is(1000000));
    }

    @Test
    public void convertMap() {
        Map<Integer, Integer> map = test.makeMap();
        System.out.println(map);
    }

    @Test
    public void rangeTest() {
        List<Integer> rangeResult = test.range(1, 5);
        System.out.println(rangeResult);
    }

    @Test
    public void countTest() {
        List<Integer> counts = Arrays.asList(3,90,20, 10);
        List<Integer> countResult = test.count(counts);
        System.out.println(countResult);
    }

    @Test
    public void takeTest() {
        List<Integer> result = test.take(10);
        assertThat(result.size(), is(10));
    }

    @Test
    public void 필터분기테스트() {
        List<Integer> filterStartNum = test.filter("2*");
        List<Integer> filterDigit = test.filter("1");
        List<Integer> filterLastNum = test.filter("*2");
        System.out.println(filterStartNum);
        System.out.println(filterDigit);
        System.out.println(filterLastNum);
        System.out.println("===");
        System.out.println(filterStartNum.size());
        System.out.println(filterDigit.size());
        System.out.println(filterLastNum.size());

    }

    @Test
    public void 자릿수테스트() {
        int digit = test.calDigit(12345);
        int digit2 = test.calDigit(-20032);
        assertThat(digit, is(5));
        assertThat(digit2, is(5));
    }

    @Test
    public void 첫자리구하기() {
        int firstNum = test.calFirstNum(-923434);
        int firstNum2 = test.calFirstNum(7596);
        assertThat(firstNum, is(9));
        assertThat(firstNum2, is(7));
    }
}
