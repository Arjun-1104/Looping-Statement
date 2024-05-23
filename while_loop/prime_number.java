import java.util.*;

public class prime_number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); 
        int i=2;
        boolean flag = true;

        while(i<n){
            if(n%i==0){
                flag = false;
            }
            i++;
        }
        System.out.println(flag);
    }
}
/*

public class prime_number{
    public static void main(String[] args){
        int n=4,count=0,i=2;
        if(n==1 || n==0){
            System.out.print("Number is prime");
        }
        else{

        while(n>i){
            if(n%i==0){
                count++;
            }
            i++;
        }
        
        if(count>0){
            System.out.println("Number is not prime");
        }
        else{
            System.out.println("Number is prime");
        }
        }
    }
}
*/