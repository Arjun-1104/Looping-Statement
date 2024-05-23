public class pattern_18{
    public static void main(String[] args){

        int n=5;
        int nsp=2*n-3;
        int nst=1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("*\t");
            }

            for(int k=1;k<=nsp;k++){
                System.out.print("\t");
            }
            for(int j=1;j<=nst;j++){
                if(j==1 && i==n){
                    j++;
                }
                System.out.print("*\t");
            }
            System.out.println();

            if(i<n){
                nsp-=2;
                nst++;
            }
            else{
                nsp+=2;
                nst--;
            }
    }
}
}


