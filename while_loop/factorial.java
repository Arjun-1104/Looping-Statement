import java.util.*;

public class factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        int i=1,ans=1;

        while(i<=n){
            ans = ans * i;
            i++;
        }
        System.out.println(ans);
    }
}
