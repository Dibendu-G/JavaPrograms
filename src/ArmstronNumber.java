import java.util.Scanner;

public class ArmstronNumber {
    public static void main(String[] args) {

//        WAP to check whether the number is armstrong or not

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int armstrong = 0;
        int org = n;
        while(n>0){
            int temp=n%10;
            temp= (int) Math.pow(temp,3);
            armstrong= armstrong+temp;
            n=n/10;
        }
        if(org==armstrong){
            System.out.println("It's an armstrong number");
        }
        else {
            System.out.println("Sorry it's not an armstrong number");
        }
    }
}
