import java.util.*;

public class Reverse_string{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        int i=1;
        String ans = " ";
        while(i<=str.length()){
            System.out.print(str.charAt(str.length()-i));
            i++;
        } 
    }
}
