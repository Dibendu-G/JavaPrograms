public class noOfDigits {
    public static void main(String[] args) {

//        Wap in java to count the no. of digits in an Number
        int n=3452156;
        int count =0;
        while(n>0){
            n=n/10;
            count = count+1;
        }
        System.out.println(count);
    }
}
