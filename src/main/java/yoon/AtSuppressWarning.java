package yoon;

interface Viewable2 {
    @Deprecated
    public void showIt(String str);

    public void brShowIt(String str);
}

class Viewer2 implements Viewable2 {
    @Override
    @SuppressWarnings("deprecation")
    public void showIt(String str) {
        System.out.println(str);
    }

    @Override
    public void brShowIt(String str) {
        System.out.println("[" + str + "]");
    }
}

public class AtSuppressWarning {
    public static void main(String[] args) {
        Viewable2 viewer2 = new Viewer2();
        viewer2.showIt("Hello Annotations");
        viewer2.brShowIt("Hello Annotations");
    }
}
