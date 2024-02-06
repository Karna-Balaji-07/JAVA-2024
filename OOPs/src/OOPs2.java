public class OOPs2 {

    int id; // reference variables
    String name; // reference variables

    void show(){  //method
        System.out.println("Student id : "+id);
        System.out.println("Student name : "+name);
    }
    public static void main(String args[]){
        System.out.println("Class and objects");
        String name = "Arjun";
        int id = 12343;
        OOPs2 obj = new OOPs2();  // creating an object
        obj.show();
        obj.id = 123432;
        obj.name = "Alice";
        obj.show();

    }
}
