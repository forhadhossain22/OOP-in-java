package OverloadingConstractor;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Robert","Male",32457651);
        t1.display();
        Teacher t2 = new Teacher("Haire","Female");
        t2.display();
        Teacher t3 = new Teacher();
        t3.display();
    }
}
