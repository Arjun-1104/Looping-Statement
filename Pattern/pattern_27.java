 import java.util.*;

    public class pattern_27{
        public static void main(String[] args){
    
            Scanner sc = new Scanner(System.in);
            System.out.print
            ("Enter a number: ");
            int n = sc.nextInt();
    
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(i==1 ||i==n ||j==1 ||j==n ||i==j ||i+j==n+1 ){
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
        
    
    

