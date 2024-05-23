
/*public class pattern_9{
    public static void main(String[] args){
        int n=5;
        int nst = n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<n){
                    System.out.print(" ");
                }
                else if(j==n){
                    System.out.print("*");
                }
                n=n-1;
            }
            System.out.println();
        
     
        }
     

    public class pattern_9{
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){  //row
            for(int j=1;j<=n-i;j++){ //spaces
                System.out.print(" ");
            }
                for(int k=1;k<=i;k++){ //stars
                    System.out.print("* ");
                }
                System.out.println();

            }
        }
    }
*/
public class pattern_9{
public static void main(String[] args){
    int n=5;
    for(int i=1;i<=n;i++){  //row
        for(int j=1;j<=n-i;j++){ //spaces
            System.out.print("\t");
        }
            for(int k=1;k<=i;k++){ //stars
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
