public class pattern_11{
public static void main(String[] args){
  //  int n=3,j;
  //  int nst=n;
   /* for(int i=1;i<=2*n-1;i++){
        for( j=1;j<=n-i;j++){
            System.out.print(" \t");
        }
        for(int k=1;k<=nst-j;k++){
            System.out.print("*\t");   
        }
        System.out.println();
    }
    
        */
        int n=3;
        int nsp =0;
        int nst = n;
        for(int i=1;i<=2*n-1;i++){
            
            for(int j=1;j<=nsp;j++){
                System.out.print("\t");
            }
            
            for(int k=1;k<=nst;k++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<n){  
                nst--;
                nsp++;
            }
            else{
                nst++;
                nsp--;
            }
        }
    }
}