public class convertAbittoBbit {
    public static int CountNBits(int n){
        int count =0;
        while (n!=0){
            count++;
            n&=(n-1);
        }
        return count;
    }
    public static int FlippedCount(int a, int b){
        return CountNBits(a^b);
    }
    public static void main(String[] args) {

//        Count the number of bits to be flipped to convert A to B
        int a =10;
        int b=35;
        System.out.println(FlippedCount(a,b));

    }
}
