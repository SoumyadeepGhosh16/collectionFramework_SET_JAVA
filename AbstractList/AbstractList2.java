import java.util.AbstractList;
import java.util.List;

 public class AbstractList2 extends AbstractList<Integer>{

public int size;
    public AbstractList2(int size){
        this.size=size;
    }

    public Integer get(int index){
        return index;
    }

    public int size(){
        return size;
    }


    public static void main(String[] args) {
        List<Integer> list = new AbstractList2(5);
        for (int i : list) {
            System.out.println(i);
        }
        

    }
}
