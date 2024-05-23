/*
public class sumOf_allEven{
    public static void main(String[] args){

        int n=100,i=1,sEven=0,sodd=0;

        while(i<=n){
            if(i%2==0){
                sEven = sEven + i;
            }
            else{
                sodd = sodd + i ;
            }
            i++;
        }
        System.out.println("Sum of even: "+sEven);
        System.out.println("Sum of odd: "+sodd);
    }
}
*/
public class sumOf_allEven{
    public static void main(String[] args){

        int n=100,i=0,sEven=0,sodd=0;

        while(i<=n){
            sEven+=i;
            i+=2;
        }
        System.out.println("Sum of even: "+sEven);    
    }
}