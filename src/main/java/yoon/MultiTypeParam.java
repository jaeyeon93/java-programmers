package yoon;

class DBox<L, R> {
    private L left; // 왼쪽 수납공간
    private R right;

    public void set(L o, R r) {
        left = o;
        right = r;
    }

    @Override
    public String toString() {
        return left + " & " + right;
    }
}

public class MultiTypeParam {
    public static void main(String [] args) {
        DBox<String, Integer> box = new DBox<String, Integer>();
        box.set("Apple", 25);
        System.out.println(box);
    }
}
