/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectangle;

/**
 *
 * @author User
 */
public class Shape {
    private int location;
    public Shape(int l){
        this.location=l;
    }
    
    public void display(){
        System.out.println("location:"+location);
    }
}
