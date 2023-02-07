public class sumOfDigits {
    public static void main(String[] args) {

//        WAP in java to find the sum of digits

        int n=43785;
        int temp;
        int sum = 0;
        while (n>0){
            temp=n%10;
            sum = sum+temp;
            n=n/10;
        }
        System.out.println(sum);
    }
}
