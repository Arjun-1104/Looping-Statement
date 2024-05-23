public class pattern_13{
public static void main(String[] args){
    int n=5,nsp=0;
    int nst=2*n-1;;

    for(int i=1;i<=n;i++){
        for(int j=1;j<=nsp;j++){
            System.out.print(" ");
        }

        for(int k=1;k<=nst;k++){
            System.out.print("*");
        }
        System.out.println();
        nsp++;
        nst-=2;
    }
    }
}  
    