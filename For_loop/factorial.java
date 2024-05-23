import java.util.*;

public class factorial{
    public static void main(String[] args){
      //  int n =5;
        int ans =1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n= sc.nextInt();

        for(int i=1;i<=n;i++){
             ans = ans * i;
        }
        System.out.println("Factorial is: "+ans);
    }
}