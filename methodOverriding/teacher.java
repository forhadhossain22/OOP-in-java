package methodOverriding;

public class teacher extends person{
    String qualification;
    
    @Override
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Qualification: "+qualification);
        System.out.println();
    }
}
