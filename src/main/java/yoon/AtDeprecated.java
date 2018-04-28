package yoon;

interface Viewable {
    @Deprecated
    public void showIt(String str);

    public void brshowIt(String str);
}

class Viewer implements Viewable {
    @Override
    public void showIt(String str) {
        System.out.println(str);
    }

    @Override
    public void brshowIt(String str) {
        System.out.println("[" + str + "|");
    }
}

public class AtDeprecated {
    public static void main(String[] args) {
        Viewable view = new Viewer();
        view.showIt("Hello Annotations");
        view.brshowIt("Hello Annotations");
    }
}
