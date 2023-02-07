public class onesAreKdistanceApart {
    public static void main(String[] args) {

//        WAP to check Whether 1's are K distance apart

        int num[] ={0,1,0,0,0,1,0,0,0,1,0,0,0,1};
        boolean flag = true;
        int k=3;
        for (int i=0;i<num.length-1;i++){
            if(num[i]==1){
                for (int j=1;j<=k;j++)
                {
                    if(num[i+j]==1){
                        flag=false;
                        break;
                    }
                }
            }
        }
        if(num[num.length-1]==0){
            flag = false;
        }
        System.out.println(flag);
    }
}
