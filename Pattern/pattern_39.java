 import java.util.*;

public class pattern_39{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print
        ("Enter a number: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 ||i==n ||j==n/2+1 ){
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
    


