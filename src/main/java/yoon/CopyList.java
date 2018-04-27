package yoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CopyList {
    public static void main(String[] args) {
        List<String> src = Arrays.asList("Box", "Apple", "Toy", "Robot");

        // 복사본을 만든다.
        List<String> dest = new ArrayList<>(src);

        // 정렬하고 그리고 출력
        Collections.sort(dest);
        System.out.println(dest);

        // dest에 저장된 내용을 src에 저장된 내용으로 덮어씀
        Collections.copy(dest, src);

        // 되돌림 확인
        System.out.println(dest);
    }
}
