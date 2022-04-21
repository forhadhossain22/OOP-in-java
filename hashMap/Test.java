package hashMap;
import java.util.HashMap;
public class Test {
    public static void main(String[] args) {
        HashMap<Integer,String>customer = new HashMap<Integer,String>();
    customer.put(101,"Jhonny");
    customer.put(102, "Deep");
    customer.put(103,"James");
    customer.put(104,"Bond");
    
        System.out.println(customer.get(101));
        System.out.println(customer.get(102));
        System.out.println(customer.get(103));
        System.out.println(customer.get(104));
    }
}
