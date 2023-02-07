import java.util.Scanner;

public class NumberNegPos {
    public static void main(String[] args) {

//        WAP to check the number whether it's +ve or -ve

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();

//        Using if - else
//        if(n<0){
//            System.out.println("The number is Negative");
//        } else if (n>=0) {
//            System.out.println("Then number is Positive ");
//        }
//        else {
//            System.out.println("Wrong input");
//    }

//        without using if-else
        String result = (n<0)?"Negative":"Positive";
        System.out.println(result);
    }
}
