import java.util.Scanner;

public class LeapYear {

    public static void isLeapYear(int year)
    {
        boolean leap = false;
        if(year %4 == 0){
            leap = true;
            if(year % 100 ==0){
                if(year % 400 == 0){
                    leap = true;
                }
                else
                    leap = false;
            }
        }
        else
            leap = false;
        if(!leap)
            System.out.println(year+" is Not a leap year");
        else
            System.out.println(year+" is a leap year");
    }

    public static void LeapYear(int year)
    {
        if((year % 4 ==0) && (year % 100 != 0) || (year %400 ==0))
            System.out.println(year+" is a leap year");
        else
            System.out.println(year+" is not a leap year");
    }
    public static void main(String args[]){
        System.out.println("To check if the given year is a leap year or not");
        Scanner year = new Scanner(System.in);
        int leapyear = year.nextInt();
        isLeapYear(leapyear);
        LeapYear(leapyear);
    }

}
