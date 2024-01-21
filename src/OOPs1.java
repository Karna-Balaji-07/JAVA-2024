
class Calculator{

    int a;    // variables
    public int add(int num1,int num2){       // method
        int r = num1 + num2;
        return r;
    }
}

public class OOPs1 {
    public static void main(String args[]){
        System.out.println("Object oriented programming!");

        int num1 = 10;
        int num2 = 24;

        Calculator calc = new Calculator() ;   // creating an object
        int result = calc.add(num1,num2);


        //int result = num1 + num2;
        System.out.println(result);
    }
}
