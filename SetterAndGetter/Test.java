package SetterAndGetter;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        
        p1.setId(102030);
        p1.setGpa(3.70);
        
        p2.setId(102040);
        p2.setGpa(3.88);
        
        System.out.println(p1.getId());
        System.out.println(p1.getGPA());
        
        System.out.println();
        
        System.out.println(p2.getId());
        System.out.println(p2.getGPA());
    }
}
