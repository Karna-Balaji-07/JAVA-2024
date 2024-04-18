//          ENCAPSULATION

class Cars{
    private String name;

    public String getName(){        // getter method
        return name;
    }

    public void setName(String name){       // Setter method
        this.name = name;
    }
}

public class OOPS_4 {
    public static void main(String args[]){
        Cars obj = new Cars();
        obj.setName("Hello");
        System.out.println(obj.getName());
    }
}
