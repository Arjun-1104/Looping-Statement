public class pattern_17{
    public static void main(String[] args){
        int n=9;
        int nst=1;
        int nsp=n-1;

        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("* ");
            }

            for(int k=1;k<=nst;k++){
                if(k==1 || k==nst){
                System.out.print("* ");
                }
                else{
                System.out.print("  ");
                }
            }

            for(int m=1;m<=nsp;m++){
                System.out.print("* ");
            }
            System.out.println();

            if(i<n){
                nst+=2;
                nsp--;
            }
            else{
                nst-=2;
                nsp++;
            }
        }
    }
}