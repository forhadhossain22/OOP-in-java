/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StaticKeyword;

/**
 *
 * @author forha
 */
public class Student {
    String name; int id;
    static String uvName = "EUB";
Student(String n,int i){
    name = n; id = i;
    }
void display(){
    System.out.println("Name is: "+name);
    System.out.println("ID is: "+id);
    System.out.println("University name: "+uvName);
    System.out.println();
    }
}
