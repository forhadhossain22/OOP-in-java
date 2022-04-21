package OverloadingConstractor;

public class Teacher {
String name,gender;
    int phone;
    
Teacher(String n,String g,int ph){
    name = n; gender = g; phone = ph;
}

Teacher(String n,String g){
    name = n; gender = g; 
}  


Teacher(){
    System.out.println("No value");
}

void display(){
    System.out.println("Name: "+name);
    System.out.println("Phone: "+phone);
    System.out.println("Gender: "+gender);
    System.out.print("\n");
    }    
}
