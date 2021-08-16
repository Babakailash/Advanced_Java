package serialization;
/*Serialization in Java is a mechanism of writing the state of an object into a byte-stream.
It is mainly used in Hibernate, RMI, JPA, EJB and JMS technologies.
The reverse operation of serialization is called deserialization
where byte-stream is converted into an object.*/

import java.io.*;

public class SerDeserDemo {
    public static void main(String[] args) {
        Student student = new Student("Kailashnath",25,"New Delhi");
        student.setX(10);

        String filename = "C:\\Users\\BABA\\Advanced_Java\\src\\serialization\\Test.txt";
        FileOutputStream fileOut = null;
        ObjectOutputStream objOut = null;
        //Serialization
        try {
            fileOut = new FileOutputStream(filename);
            objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(student);

            objOut.close();
            fileOut.close();

            System.out.println("Object has been serialized: \n"+student);
        } catch (IOException ex){
            System.out.println("IOexception is caught");
        }
        // Deserialization
        FileInputStream fileIn = null;
        ObjectInputStream objIn = null;
        try{
            fileIn = new FileInputStream(filename);
            objIn = new ObjectInputStream(fileIn);

            Student object = (Student) objIn.readObject();
            System.out.println("Object has been deserialized: \n" + object);
            System.out.println("the deserialized value of x is: "+ object.getX());
            objIn.close();
            fileIn.close();
        } catch (IOException ex){
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex){
            System.out.println("ClassNotFoundException" + " is caught");
        }
    }
}
