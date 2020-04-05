package designpattern;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(value = {ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface UserAnnotation {
    public int number() default 0;
    public String text() default "hello annotation";
}

class UserAnnotationSample {
    @UserAnnotation(number = 1, text = "hello world")
    public static void main(String[] args) {
        UserAnnotationSample annotation = new UserAnnotationSample();
        annotation.checkAnnotations(UserAnnotationSample.class);
    }

    @UserAnnotation(number = 100)
    public void sample() {
    }

    @UserAnnotation(number = 100, text = "1")
    public void sample2(){}

    public void checkAnnotations(Class useClass) {
        Method[] methods = useClass.getDeclaredMethods();
        for (Method method: methods) {
            UserAnnotation annotation = method.getAnnotation(UserAnnotation.class);
            if (annotation != null) {
                int number = annotation.number();
                String text = annotation.text();
                System.out.println("number : " + number + " text : " + text);
            }
        }
    }
}
