import java.util.*;

public class AbstractList1 {
    public static void main(String[] args) {
        
        AbstractList<String> list=new LinkedList<String>();

        list.add("I");
        list.add("AM");
        list.add("SOUMYADEEP");
        list.add("GHOSH");

        System.out.println("AbstractList: " + list); 

        list.remove(3); 

        System.out.println("Final AbstractList: " + list); 

        int lastindex = list.lastIndexOf("A"); 

        System.out.println("Last index of A : "
                        + lastindex); 
    }
}
