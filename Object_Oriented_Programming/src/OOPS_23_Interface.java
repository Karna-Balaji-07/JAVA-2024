/* Resizable interface for object resizing with rectangle class implementation*/

interface Resizable{
    void Rwidth(int width);
    void Rlength(int length);
}

class Rectangle3 implements Resizable{
    private int length;
    private int breadth;

    public Rectangle3(int l, int b){
        this.length = l;
        this.breadth = b;
    }
    public void Rwidth(int width){
        this.breadth = width;
    }

    @Override
    public void Rlength(int length) {
        this.length = length;
    }
    public void info(){
        System.out.println("Length : "+length);
        System.out.println("Width : "+breadth);
    }
}
public class OOPS_23_Interface {
    public static void main(String args[]){
        Rectangle3 obj = new Rectangle3(21,43);
        obj.info();
        obj.Rlength(120);
        obj.Rwidth(3241);
        obj.info();
    }
}
