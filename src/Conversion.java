public class Conversion {
    public static void main(String args[])
    {
        Boolean value = true;
        String s = "3.1418435";
        double num = Double.valueOf(s);
        //double num = Double.parseDouble(s);
        String bool = value.toString();
        System.out.println(bool);
        System.out.println(num);
    }
}
