package javautil;

public class Box<E> {
    // box는 가상클래스E를 사용하겠다.
    public E obj;

    public void setObj(E obj){
        this.obj = obj;
        //매개변수로 들어온obj와 필드의 obj가 같으므로 this를 사용
    }

    public E getObj(){
        return obj;
    }


}
