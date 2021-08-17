package autoboxingUnautoboxing;
/*Autoboxing is the automatic conversion that the Java compiler makes between
the primitive types and their corresponding object wrapper classes. For example,
converting an int to an Integer, a double to a Double, and so on.
If the conversion goes the other way, this is called unboxing*/

public class AutoBoxingDemo {
    public static void main(String[] args) {
        int i =10; // primitive data type
        // Autobox
        Integer iObj = Integer.valueOf(i); // wrapper class type
        System.out.println("Value of Integer obj: "+iObj);

        // auto-unbox
        int i1 = iObj;
        System.out.println("Value of i1: "+i1);

        //Autobox
        Character charObj = 'a';

        // Auto - unbox
        char ch = charObj;
        System.out.println("Value of ch: "+ch);
        System.out.println("Value of charObj: "+charObj);

    }
}
