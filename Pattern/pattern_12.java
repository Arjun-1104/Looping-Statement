public class pattern_12{
public static void main(String[] args){
    /*int n=5,nsp=n-1,nst=1;
    
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("\t");
            }
            for(int k=1;k<=nst;k++){
                System.out.print("*\t");
            } 
            nsp--;
            nst+=2;  
            System.out.println(); 
        }
    */
    int n=3,nst=1,nsp=0;
    for(int i=1;i<=n;i++){
        nsp=n-i;
        for(int j=1;j<=nsp;j++){
            System.out.print(" ");
            
        }
        for(int k=1;k<=nst;k++){
            System.out.print("*");
        }
        if(i<n){
            nst+=2;
        }
        System.out.println();
    }    

        
    }
}  
    