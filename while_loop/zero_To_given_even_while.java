import java.util.*;

public class zero_To_given_even_while{
    public static void main(String[] args){
        int i=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ending point: ");
        int end = sc.nextInt();

        while(i<=end){
            System.out.println(i);
            i++;
        }

    }
}