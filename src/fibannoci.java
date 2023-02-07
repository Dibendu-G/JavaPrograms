public class fibannoci {
    public static void main(String[] args) {

//        WAP to find the fibonnaci series in java
        int n=7;
        int f=1,s=1,t;
        System.out.print(f);
        System.out.print(s);
        for(int i=3;i<=n;i++){
            t=f+s;
            System.out.print(t);
            f=s;
            s=t;
        }
    }
}
