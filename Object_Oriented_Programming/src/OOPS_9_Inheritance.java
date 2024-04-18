/* Create a class called Shape with method called getArea
and a subclass called Rectangle
 */

class Shape1{
    public int getArea(){
        return 0;
    }
}

class Rectangle1 extends Shape1{
    public int length;
    public int breadth;

    public Rectangle1(int l, int b){
        this.length = l;
        this.breadth = b;
    }

    public int getArea(){
        return length*breadth;
    }
}

public class OOPS_9_Inheritance {
    public static void main(String args[]){
        int l = 10;
        int b = 34;
        Rectangle1 obj = new Rectangle1(l,b);
        int res = obj.getArea();
        System.out.println("Area of the rectangle : "+res);
    }
}
