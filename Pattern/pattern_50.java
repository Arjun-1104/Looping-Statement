 import java.util.*;

public class pattern_50{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print
        ("Enter a number: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1 ||j==n ||i==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
        System.out.println();
    }
    }
} 
    

