import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

//        WAP to check whether the number is prime or not

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n= sc.nextInt();
        boolean prime = true;
        for (int i=2;i<n;i++)
        {
            if(n%i==0){
                prime=false;
                break;
            }
        }
        System.out.println("the number is = "+prime);
    }
}
