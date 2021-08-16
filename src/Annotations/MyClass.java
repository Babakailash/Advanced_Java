package Annotations;
/*Java defines seven built-in annotations.
Four are imported from java. lang. annotation: @Retention, @Documented, @Target, and @Inherited.
Three are included in java.lang: @Deprecated, @Override and @SuppressWarnings.*/

/*In the Java computer programming language, an annotation is a form of syntactic metadata that
can be added to Java source code. Classes, methods, variables, parameters and Java packages may
be annotated. Like Javadoc tags, Java annotations can be read from source files.*/
import java.lang.reflect.Method;

public class MyClass {
    @MyCustomAnnotation(value = 10)
    public void sayHello(){
        System.out.println("my custom annotation");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        MyClass h = new MyClass();
        Method methodVal = h.getClass().getMethod("sayHello");

        MyCustomAnnotation myCustomAnnotation = methodVal.getAnnotation(MyCustomAnnotation.class);
        System.out.println("value is: "+myCustomAnnotation.value());
    }
}
