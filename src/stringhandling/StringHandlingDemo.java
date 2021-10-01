package stringhandling;

import java.util.Arrays;

public class StringHandlingDemo {
    public static void main(String[] args) {
        String str1 = "Kailash is studying";
        String str2 = " in University";
        System.out.println(str1.length());  // count length

        String result = str1.concat(str2);
        System.out.println(result); // concat function add string

        String r = String.format("The name of student is " + "%s, and the age is " + " %d,", "Kailash", 24); // format
        System.out.println(r);
        System.out.println(str1.charAt(5));  // particular string char select

        if (str1.equals(str2)) {
            System.out.println("both strings are same");
        } else {
            System.out.println("both strings are different");
        }

          System.out.println(str1.indexOf('y'));   // index count
          System.out.println(str1.replace('s', 'r')); // change string char

          String[] arr = str1.split(" ");  // split and showing strings as list
          Arrays.asList(arr).forEach(s -> System.out.println(s));

          String newStr1 = str1.substring(1,5); // showing only substring 
          System.out.println(newStr1);
    }
}

