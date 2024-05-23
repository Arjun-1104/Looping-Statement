public class pattern_15{
    public static void main(String[] args){
        int n=5;
        int nsp=2*n-3;
           int nst=1;

        for(int i=1;i<=2*n-1;i++){ //rows

            for(int j=1;j<=nst;j++){ // star1
                System.out.print("*\t");
            }
            for(int k=1;k<=nsp;k++){ //spaces
                System.out.print("\t");
            }
            for(int m=1;m<=nst;m++){
                if( i==n && m==1){
                    m++;
                }                          //star2
                System.out.print("*\t");
            }
            System.out.println();
            
            if(i<n){
                nst++;
                nsp-=2;
            }
            else{
                nst--;
                nsp+=2;
            }
        }
    }
}