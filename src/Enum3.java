import java.util.*;

enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

public class Enum3 {
    public static void main(String args[])
    {
        for(Day day : Day.values())
        {
            System.out.println(day);
        }
    }


}
