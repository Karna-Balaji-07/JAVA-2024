

public class ComplexNumbers {

    int real,img;
    public ComplexNumbers(int r, int i){
        this.real = r;
        this.img = i;
    }
    public void show(){
        System.out.println(this.real + " + "+this.img+"i");
    }
    public static ComplexNumbers add(ComplexNumbers n, ComplexNumbers m){
        ComplexNumbers res = new ComplexNumbers(0,0);
        res.real = n.real + m.real;
        res.img = n.img + m.img;
        return res;

    }
    public static void main(String args[]){
        System.out.println("Addition of two complex numnbers");
        ComplexNumbers n = new ComplexNumbers(2,4);
        ComplexNumbers m = new ComplexNumbers(7,5);

        System.out.println("first complex number : ");
        n.show();
        System.out.println("second complex number : ");
        m.show();

        ComplexNumbers res = add(n,m);
        System.out.println("The sum is : ");
        res.show();

    }
}
