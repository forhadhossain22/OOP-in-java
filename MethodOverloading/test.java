/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MethodOverloading;

/**
 *
 * @author forha
 */
public class test {
    public static void main(String[] args) {
        Overload obj = new Overload();
        obj.add();
        obj.add(5, 2);
        obj.add(5.50, 2.55);
        obj.add(12, 2, 5);
    }
}
