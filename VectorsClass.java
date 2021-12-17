import java.util.ArrayList;
import java.util.Vector;

public class VectorsClass {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        System.out.println("********vector********");
        for (int i = 0; i < 30; i++) {
            v.add(i*2);
            System.out.println("iteration is :" + i + "and capacity is : " + v.capacity());
        }
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println("*************arraylist***************");
        for (int i = 0; i < 30; i++) {
            a.add(i*2);
            System.out.println("iteration is :" + i + "and capacity is : " + a.size());
        }
    }
}
