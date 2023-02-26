public class MaxSum {
    public static int findSingle(int [] ar,int arr_size){
        int res=ar[0];
        for(int i=1;i<arr_size;i++)
        {
            res=res ^ ar[i];
        }
        return res;
    }
    public static void main(String[] args) {

//        Find the element that appears once in an array where every
//        other element appears twice.
//        The best solution is to use XOR. XOR of all array elements gives us
//        the number with a single occurrence.
//        The idea is based on the following two facts.
//        XOR of a number with itself is 0.
//        XOR of a number with 0 is number itself.

        int arr [] = {2 ,4 ,2 ,5 ,4 ,6 ,4 ,2 ,5 ,3 ,1 ,0};
        int n=arr.length;
        System.out.println(findSingle(arr,n));
    }
}
