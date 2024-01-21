class Calculators{
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public int add(int n1, int n2){
        return n1+n2;
    }
    public double add(double n1, int n2){
        return n1+n2;
    }
}


public class OOPs3 {
    public static void main(String args[]){
        int num1 = 43;
        int num2 = 34;
        int num3 = 67;
        double num4 = 543.543;


        Calculators obj = new Calculators();
        int r1 = obj.add(num1,num2);
        int r2 = obj.add(num2,num3,num1);
        System.out.println(r1);
        System.out.println(r2);
    }
}
