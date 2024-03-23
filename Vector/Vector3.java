import java.util.Vector;

public class Vector3 {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>(3,2);

        v.addElement(5);
        v.addElement(1);
        v.addElement(9);
        v.addElement(4);

        v.insertElementAt(6, 0);

        v.removeElementAt(1);

        int n=v.size();

        for(int i=0;i<n;i++){
            System.out.println(v.get(i));
        }
    }
}
