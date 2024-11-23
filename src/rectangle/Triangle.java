package rectangle;

public class Triangle extends Shape{
    private int base;
    private int height;

    public Triangle(int b,int h,int l) {
        super(l);
        this.base=b;
        this.height=h;
    }
    
    public void displayTarin(){
        super.display();
        System.out.println("base: "+base);
        System.out.println("height: "+height);
    }
    
    public static void main(String[] args) {
        Triangle t=new Triangle(12, 5, 1);
        t.displayTarin();
    }
    
    
}
