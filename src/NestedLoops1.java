public class NestedLoops1 {
    public static void main(String args[]){
        System.out.println("Pyramid number pattern ");
        for(int i=0;i<4;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println ();
        }
    }
}
