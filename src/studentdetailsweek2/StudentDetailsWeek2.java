/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package studentdetailsweek2;

/**
 * This class +++Introduction+++
 *
 *@author Cody Tremblay
 */
import java.util.Scanner;
public class StudentDetailsWeek2 {
    public static void main(String[] args) {
       
    Student[] List = new Student[3];
        
    Student s1 = new Student ();//Creation of new object s1
    Student s2 = new Student ();//Creation of new object s2
    Student s3 = new Student ();//Creation of new object s3
    
    s1.setName("John");
    s1.setAge(19);
    
    s2.setName("Cody");
    s2.setAge(26);
    
    s3.setName("Chris");
    s3.setAge(22);
    
    List[0]=s1;
    List[1]=s2;
    List[2]=s3;
    
    for (int i =0;i<List.length;i++)
    {
       System.out.println(List[i]);
    }//Method using toString
    
    for (int i =0;i<List.length;i++)
    {
       System.out.println(List[i].getName()+"\t"+List[i].getAge());
    }//Method using getters
    
    System.out.println("THIS IS CHANGE");
    
    }

}

