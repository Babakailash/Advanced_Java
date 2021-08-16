package serialization;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String address;

     int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", address='" + this.getAddress() + '\'' +
                '}';
    }
}
