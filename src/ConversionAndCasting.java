public class ConversionAndCasting {
    public static void main(String args[]){
        System.out.println("Type conversion and casting ");

        byte a = 127;
        int b = a;
        System.out.println("integer : "+b);

        int q = 257;
        byte w = (byte)q;
        System.out.println("Byte : "+w);

        float f = 5.6f;
        int i = (int) f;
        System.out.println("Integer : "+i);
    }
}
