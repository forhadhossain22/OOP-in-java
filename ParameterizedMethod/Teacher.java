package ParameterizedMethod;

public class Teacher {
    String name,gender;
    int phone;

void setInfo(String n,String g,int ph){
    name = n; gender = g; phone = ph;
}
    

void display(){
    System.out.println("Name: "+name);
    System.out.println("Phone: "+phone);
    System.out.println("Gender: "+gender);
    System.out.print("\n");
    }
}