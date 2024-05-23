public class pattern_16{
public static void main(String[] args){
    
    int n=3;
    int nsp=n-1;
    int nst=1;

    for(int i=1;i<=2*n-1;i++){
        for(int j=1;j<=nsp;j++){
            System.out.print("\t");
        }
        for(int k=1;k<=nst;k++){
            if(k==1 || k==nst){
                System.out.print("*\t");
            }
            else{
                System.out.print("\t");
            }
        }
         System.out.println();
        if(i<n){
            nsp--;
            nst=nst+2;
        }
        else{
            nsp++;
            nst=nst-2;
        }
    }
    }
}  
    