public class String_Buffer {
    public static void main(String args[]){

        StringBuffer sb = new StringBuffer("Hello World");

        //append method
        sb.append(" to the world");
        String appended = sb.toString();

        //insert method
        sb.insert(  0,"Hola ");
        String inserted = sb.toString();

        //replace method
        sb.replace(0,5,"Howdy" );
        String replaced = sb.toString();

        //Delete Method
        sb.delete(0,5);
        String deleted = sb.toString();

        //Reverse method
        sb.reverse();
        String reversed = sb.toString();

        //Capacity of the String Buffer
        int capacity = sb.capacity();

        System.out.println("Append method : "+appended);
        System.out.println("Insert method : "+inserted);
        System.out.println("Replace method : "+replaced);
        System.out.println("Delete method : "+deleted);
        System.out.println("Reverse Method : "+reversed);
        System.out.println("Capacity of the StringBuffer : "+capacity);
    }
}
