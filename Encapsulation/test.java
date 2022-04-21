/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulation;

/**
 *
 * @author forha
 */
public class test {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Forhad Hossain");
        p1.setAge(23);
       // p1.display();        primary way
        //smart way
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
    }
    
}
