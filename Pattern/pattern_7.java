public class pattern_7{
    public static void main(String[] args){
        int n=3;
        int nst = n;
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            System.out.println();
            if(i<n){   //yaha par = aayega ki nahi?
                nst--;
            }
            else{
                nst++;
            }
        }
    }
}