/*
public class prime_100tak{
    public static void main(String[] args){
        int n=100,i=25,count=0,j=2;
        System.out.print("All prime numbers: 1,2,3,");
        
        while(i<=n){
            while(i>j){
                if(i%j==0){
                    count++;
                }
                j++;
            }
            if(count>0){
                System.out.print(i+",");
            }
            count=0;
            j=2;
            i++;
        
        }
    }
}
*/
public class prime_100tak{
    public static void main(String[] args){

        int n =  1000;

        boolean prime[] = new boolean[n + 1]; 
        for (int i = 0; i <= n; i++) 
            prime[i] = true; 
  
        for (int p = 2; p * p <= n; p++) { 
            // If prime[p] is not changed, then it is a 
            // prime 
            if (prime[p] == true) { 
                // Update all multiples of p greater than or 
                // equal to the square of it numbers which 
                // are multiple of p and are less than p^2 
                // are already been marked. 
                for (int i = p * p; i <= n; i += p) 
                    prime[i] = false; 
            } 
        } 
  
        // Print all prime numbers 
        for (int i = 2; i <= n; i++) { 
            if (prime[i] == true) 
                System.out.print(i + " "); 
        } 
    } 
    // int n=1,m=100;
    // for(int i=n;i<=m;i++){
        // int k=i;
        // boolean flag = true;

        // for(int j=2;j<=k-1;j++){
            // if(k%j==0){
                // flag = false;
            // }
        // }
        // if(flag == true){
            // System.out.print(k+" ");
        // }
    // }
    }
