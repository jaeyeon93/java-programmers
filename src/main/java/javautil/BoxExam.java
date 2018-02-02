package javautil;

public class BoxExam {
    public static void main(String [] args){
//        Box box = new Box();
//        box.setObj(new Object());
//        Object obj = box.getObj();
//
//        box.setObj("hello");
//        // String타입으로 넣었는데, Object타입으로 리턴을 한다.
//        String str = (String)box.getObj();
//        // 형변환을 통해서 꺼내야된다.
//        System.out.println(str);
//
//        box.setObj(1);
//        int value = (int)box.getObj();
        Box<Object> box = new Box<>();
        box.setObj(new Object());
        Object obj = box.getObj();

        Box<String> box2 = new Box<>();
        box2.setObj("hello");
        String str = box2.getObj();

        Box<Integer> box3 = new Box<>();
        box3.setObj(4);
        int v2 = box3.getObj();
    }
}
