
class Computer{
    public void playMusic(){
        System.out.println("Music playing..");
    }
    public String pen(int cost){
        if(cost >=15)
            return "pen is good";
        return "nothing";
    }
}


public class OOPs2 {
    public static void main(String args[]){
        Computer pc = new Computer();
        pc.playMusic();
        String str = pc.pen(10);
        System.out.println(str);
    }
}
