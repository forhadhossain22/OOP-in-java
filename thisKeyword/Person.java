
package thisKeyword;

public class Person {
    String name; String hairColor;
    int age;
    
Person(String n, String h, int a){
    this.name = n;
    this.age = a;
    this.hairColor = h;
    }

void display(){
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
    System.out.println("Hair Color: "+hairColor);
    }
}
