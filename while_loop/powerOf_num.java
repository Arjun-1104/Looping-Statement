import java.util.*;

public class powerOf_num{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.print("Enter a power: ");
        int pow = sc.nextInt();
        int ans=1;

        while(pow>0){
            ans = ans * n;
            pow--; 
        }
        System.out.print("answer is: "+ans);

    }
}