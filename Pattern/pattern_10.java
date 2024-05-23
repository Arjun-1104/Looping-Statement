public class pattern_10{
public static void main(String[] args){
    int n=3;
    for(int i=1;i<=2*n-1;i++){
        for(int j=1;j<=i-1;j++){
            System.out.print(" \t");

        }
        for(int k=1;k<=(n+1-i);k++){
            System.out.print("*\t");
        }
        System.out.println();
    }
    }
}