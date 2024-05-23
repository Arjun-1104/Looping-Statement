public class pattern_19{
    public static void main(String[] args){

        int n = 5;
        int nsp = 0;

        for(int i=1;i<=n;i++){
        int count = n+1-i;
        for(int j=1;j<=nsp;j++){
        System.out.print("  ");
        }
        for(int k=1;k<=n+1-i;k++){
        System.out.print(count-- +" ");
        }
        System.out.println();

        if(i<=n){
        nsp++;
        }
        }
    }
}
