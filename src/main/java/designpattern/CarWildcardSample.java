package designpattern;

import java.util.List;

public class CarWildcardSample {
    public static void main(String[] args) {
        WildCardGeneric<String> card = new WildCardGeneric<>();
        Class<String> temp = String.class;
        System.out.println(temp);

    }

    public <T> void genericMethod(WildCardGeneric<T> c, T addValue) {
        c.setWildCard(addValue);
        T value = c.getWildCard();
        System.out.println(value);
    }

}

class WildCardGeneric<W> {
    W wildCard;
    public void setWildCard(W wildCard) {
        this.wildCard = wildCard;
    }

    public W getWildCard() {
        return wildCard;
    }
}
