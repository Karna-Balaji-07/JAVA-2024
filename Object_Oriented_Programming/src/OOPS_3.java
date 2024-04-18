//      ABSTRACTION

abstract class Car{
    public abstract void stop();
}

class Honda extends Car{
    public void stop(){
        System.out.println("Honda stops");
    }
}

public class OOPS_3 {
    public static void main(String args[]){
        Car obj = new Honda();
        obj.stop();
    }
}
