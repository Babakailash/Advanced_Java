package enums;
/*The Enum in Java is a data type which contains a fixed set
 of constants. ... Enums are used to create our own data type
 like classes. The enum data type (also known as Enumerated Data
 Type) is used to define an enum in Java. Unlike C/C++, enum
 in Java is more powerful.*/

public class Main {
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println("Red Enum name: "+c1.name());
        System.out.println("Red Enum value: "+c1.getValue());

        for(Color color : Color.values()){
            System.out.println("Enum name: "+color.name());
            System.out.println("Enum value: "+color.getValue());
        }
    }
}
