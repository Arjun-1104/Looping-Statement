public class pattern_5{
    public static void main(String[] args){
        int n=5,count=1;
        boolean t = true, f = false;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+"\t");
                count++;
            }
            System.out.println();
        }
    }
}
