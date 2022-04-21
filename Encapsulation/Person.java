/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulation;

/**
 *
 * @author forha
 */
public class Person {
    private String name; private int age;
    
    public String getName(){
    return name;
    } 
    public void setName(String name){
    this.name = name;
    }
    
    public int getAge(){
    return age;
    }
    public void setAge(int age){
    this.age = age;
    }    
void display(){
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
    System.out.println();
    }  
}
