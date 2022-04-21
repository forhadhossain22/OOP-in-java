
package anonymousClass;

public class test {
    public static void main(String[] args) {
        person p = new person(){
    @Override
    void display(){
        System.out.println("Test Class");
        }
    };
    p.display();
    }
}
