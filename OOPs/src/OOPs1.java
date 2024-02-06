public class OOPs1 {

    static String ename;
    static float esalary;

    static void set(String n, float f){
        ename = n;
        esalary = f;
    }

    static void show(){
        System.out.println("Employee name : "+ename);
        System.out.println("Employee salary : "+esalary);
    }
    public static void main(String args[]){
        System.out.println("OOPs demo code");
        String name = "Ravi";
        float num = 53241.432f;
        OOPs1.set(name,num);
        OOPs1.show();

    }
}