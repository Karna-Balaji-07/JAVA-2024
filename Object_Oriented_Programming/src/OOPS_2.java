// INITIALIZE BY USING METHOD / FUNCTION


public class OOPS_2 {
    static String name;
    static String id;
    static int age;

    static void set(String fname, String fid, int fage){
        name = fname;
        id = fid;
        age = fage;
    }

    static void get(){
        System.out.println("Name is : "+name);
        System.out.println("Age is : "+age);
        System.out.println("ID is : "+id);
    }
    public static void main(String args[]){
        OOPS_2.set("John","123jlkj", 23);
        OOPS_2.get();
    }
}

