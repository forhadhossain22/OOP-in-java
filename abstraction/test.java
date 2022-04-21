package abstraction;

public class test {
    public static void main(String[] args) {
        MobileUser mu; //reference variable
        
        mu = new Riyad() {};
        mu.sendMessage();
        
        mu = new Forhad() {};
        mu.sendMessage();
    }
}
