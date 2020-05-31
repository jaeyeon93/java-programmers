import java.util.*;

public class ZamCalculator {
    private List<Integer> list;
    private static Map<Integer, Integer> map = new HashMap<>();

    public ZamCalculator(List<Integer> list) {
        this.list = list;
        makeMap();
    }

    public boolean exists(int num) {
        if (list.contains(num))
            return true;
        return false;
    }

    public Map<Integer, Integer> makeMap() {
        for (int key : list)
            if (map.containsKey(key)) {
                int count = map.get(key);
                map.put(key, ++count);
            } else
                map.put(key, 1);
        return map;
    }

    public List<Integer> range(int from, int to) {
        TreeMap<Integer, Integer> map = new TreeMap<>(getMap());
        Map<Integer, Integer> subMap = map.subMap(from, to+1);
        List<Integer> result = new ArrayList<>();
        subMap.forEach((key, value) -> {
            for (int i = 0; i < value; i++)
                result.add(key);
        });
        return result;
    }

    public List<Integer> count(List<Integer> counts) {
        List<Integer> result = new ArrayList<>();
        for (int key : counts)
            if (getMap().containsKey(key))
                result.add(getMap().get(key));
            else
                result.add(0);
        return result;
    }

    public List<Integer> getList() {
        return list;
    }

    public Map<Integer, Integer> getMap() {
        return map;
    }

    public List<Integer> take(int maxCount) {
        TreeSet<Integer> treeSet = new TreeSet<>(list);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < maxCount; i++) {
            int last = treeSet.pollLast();
            System.out.println(last);
            result.add(last);
        }
        return result;
    }

    public List<Integer> filter(String input) {
        if (!input.contains("*")) {
            int digit = Integer.parseInt(input);
            return filterByDigit(digit);
        }

        if (input.startsWith("*")) {
            int lastNum = Integer.parseInt(input.substring(1));
            return finishNumList(lastNum);
        }
        int startNum = Integer.parseInt(input.substring(0, input.length()-1));
        return filterByStartNum(startNum);
    }

    public List<Integer> filterByDigit(int digit) {
        List<Integer> filtered = new ArrayList<>();
        getMap().forEach((key, value) -> {
            if (calDigit(key) == digit)
                for (int count = 0; count < value; count++)
                    filtered.add(key);
        });
        return filtered;
    }

    public List<Integer> filterByStartNum(int startNum) {
        List<Integer> filtered = new ArrayList<>();
        getMap().forEach((key, value) -> {
            if (calFirstNum(key) == startNum)
                for (int count = 0; count < value; count++)
                    filtered.add(key);
        });
        return filtered;
    }

    public List<Integer> finishNumList(int lastNum) {
        List<Integer> result = new ArrayList<>();
        getMap().forEach((key, value) -> {
            if (key % 10 == lastNum) {
                for (int i = 0; i < value; i++)
                    result.add(key);
            }
        });
        return result;
    }

    public int calDigit(int num) {
        num = Math.abs(num);
        int digit = 0;
        while (num > 0) {
            digit++;
            num /= 10;
        }
        return digit;
    }

    public int calFirstNum(int num) {
        num = Math.abs(num);
        while (true) {
            if (num < 10) {
                break;
            }
            num /= 10;
        }
        return num;
    }
}
