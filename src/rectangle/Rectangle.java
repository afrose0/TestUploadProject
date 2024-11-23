/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangle;
public class Rectangle extends Shape{
    private int height;
    private int width;
    public Rectangle(int h,int w,int l){
        super(l);
        this.height=h;
        this.width=w;
    }
    
    public void display(){
        super.display();
        System.out.println("height:"+height);
        System.out.println("width:"+width);
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        Rectangle r=new Rectangle(10, 5, 2);
//        r.display();
//    }
    
}
