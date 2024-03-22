import java.util.*;
import java.io.*;

public class Vector2 {
    public static void main(String[] args) {
        Vector v1=new Vector();

        v1.add(4);
        v1.add(9);
        v1.add(7);
        v1.add("learning");
        v1.add("practicing");

        System.out.println(v1);

        int n=5;

        Vector<Integer> v2=new Vector<Integer>();

        v2.add(1);
        v2.add(2);
        v2.add(3);

        System.out.println("Vector v2 is " + v2);

    }
}
