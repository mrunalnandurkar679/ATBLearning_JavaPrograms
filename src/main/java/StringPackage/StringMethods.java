package StringPackage;

import java.util.Scanner;

public class StringMethods {
    ;

    public static void main(String[] args) {
        String s1 = "Mrunal";
        s1.toLowerCase();   // String is immutable hence the method can not be executed
        System.out.println(s1);
        System.out.println(s1.toLowerCase());
        StringBuffer stringbuffer = new StringBuffer("Mrunal");
        System.out.println(stringbuffer.append("Nandurkar"));
        System.out.println(stringbuffer.reverse());
        System.out.println(stringbuffer.indexOf("n"));

}}