package studentList;

import java.util.LinkedList;

public class test {
    public static void main(String[] args) {
        LinkedList<student>list = new LinkedList<student>();
    student s1 = new student(101,"Robert", "Ten");
    student s2 = new student(102,"Fandros", "Eleven");
    student s3 = new student(103,"Jassica", "Twelve");
    
    list.add(s1);
    list.add(s2);
    list.add(s3);
    
    for(student s: list){
            System.out.println(s.id+"\t"+s.name+"\t\t"+s.className);
    }
  }
}
