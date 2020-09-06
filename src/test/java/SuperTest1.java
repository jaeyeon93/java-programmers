import org.junit.Test;

import java.util.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class SuperTest1 {

    @Test
    public void 집합이정상적으로만들어지는() {
        String input = "12,356";
        System.out.println(Integer.parseInt(input.replaceAll(",","")));
    }
}
