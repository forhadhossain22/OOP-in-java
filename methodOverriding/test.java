
package methodOverriding;

public class test {
    public static void main(String[] args) {
        teacher t = new teacher();
        t.name = "Hanrey";
        t.age = 32;
        t.qualification = "MSc in CS";
        t.display();
        
        person p = new person();
        p.name ="Forhad";
        p.age = 23;
        p.display();
    }
}
