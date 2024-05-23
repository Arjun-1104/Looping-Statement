import java.util.*;

public class Armstrong{
    public static void main(String[] args){
       Scanner sc =  new Scanner(System.in);
       int n= sc.nextInt();
       int temp,arm=0,rem=0;
       temp = n;
       

       while(n>0){
        rem = n%10;
        arm = arm +(rem*rem*rem);
        n = n/10;

       }
       if(temp == arm){
            System.out.println("number is armstong");
       }
       else{
            System.out.println("Number is not armstrong");
       }
    }
}
/*
public class Armstrong{
     public static void main(String[] args){
          Scanner sc =  new Scanner(System.in);
          int n= sc.nextInt();
          int r=0,arm=0,i=1;
          int temp=n;

          while(n>0){
               n = n/10;
               count++;
          }
          while(i<count){
               r = temp%10;
               arm = arm + (r*count);
               temp = temp/10;
               i++;
          }

       
       
       

       
     
     
     

     
       if(temp == arm){
            System.out.println("number is armstong");
       }
       else{
            System.out.println("Number is not armstrong");
       }
    }
}
*/