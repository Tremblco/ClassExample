/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdetailsweek2;

/**
 *
 * @author Cody
 */
public class Student {
    
    private String name;//we use private so that other class cant manipulate the data
    private int age;
    
    public Student ()//develop no arg constructor if you wanna insert values in perenthasis in main
    {}
    
    public void setName(String name)
    {
        this.name=name;
    }
    
    public void setAge (int age)
    {
       this.age=age;
    }
    
    public String getName()
    {
       return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public String toString ()
    {
        return "Student Name: "+name+"\tStudent Age: "+age;
    }
    
}
