class mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + " "+ name + " "+ price);
    }

}


public class Static {
    public static void main(String args[]){
        mobile obj = new mobile();
        obj.brand = "samsung";
        obj.name = "galaxy";
        obj.price = 3245324;


        mobile mob = new mobile();
        mob.brand = "iphone";
        mob.name = "cesso";
        mob.price = 32424;

        mob.show();
        obj.show();

    }
}
