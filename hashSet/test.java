package hashSet;
import java.util.HashSet;
public class test {
    public static void main(String[] args) {
        HashSet<String>fruitsName=new HashSet<String>();
        fruitsName.add("Apple");
        fruitsName.add("Mango");
        fruitsName.add("Orange");
        fruitsName.add("Lichi");
        fruitsName.add("Black Berry");
        System.out.println(fruitsName);
        System.out.println("Box-Size: "+fruitsName.size());
        fruitsName.remove("Apple");
        System.out.println(fruitsName);
        fruitsName.clear();
        System.out.println(fruitsName);
        boolean value = fruitsName.isEmpty();
        System.out.println(value);
    }
}