//java program to implement vector class

import java.util.*;
import java.io.*;

public class Vector1 {
    public static void main(String[] args) {
        
        int n=5;

        Vector<Integer> v=new Vector<>(n);

        for(int i=1;i<=n;i++){
            //adding elements in the vector class
            v.add(i);
        }

        System.out.print(v);

        //removing elements from the vector class
        v.remove(2);

        for (int i = 0; i <n; i++) {
            System.out.println(v.get(i));
        }
    }
}
