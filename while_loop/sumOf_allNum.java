import java.util.*;

public class sumOf_allNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int i=1,sum=0;

        while(i<=n){
            sum = sum + i;
            i++;

        }
        System.out.println("Sum is: "+sum);

    }
}