package generics;
/*Generics mean parameterized types. The idea is to allow type (Integer, String, … etc,
and user-defined types) to be a parameter to methods, classes, and interfaces.
An entity such as class, interface, or method that operates on a parameterized type is called a generic entity. */

public class SingleGenericHolder <T>{
    T obj;

    SingleGenericHolder(T obj){
        this.obj = obj;
    }

    public T getObject(){
        return this.obj;
    }

    public static void main(String[] args) {
        SingleGenericHolder<Integer> iObj = new SingleGenericHolder<>(10);
        System.out.println(iObj.getObject());

        SingleGenericHolder<String> sObj = new SingleGenericHolder<>("SimpliCode");
        System.out.println(sObj.getObject());
    }
}
