import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

//        Write a Program to find whether a year is leap year or not
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year % 400 ==0 || year%4==0)
            System.out.println("It's an Leap year");
        else if(year%100==0)
            System.out.println("It's not an Leap year");
    }
}
