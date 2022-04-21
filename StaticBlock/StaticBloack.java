/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StaticBlock;

/**
 *
 * @author forha
 */
public class StaticBloack {
    static int id; static String name;
    static{
    id = 120241; name = "Forhad Hossain";
    }
static void display(){
    System.out.println("Name is: "+name);
    System.out.println("ID is: "+id);
    System.out.println();
    }
}
