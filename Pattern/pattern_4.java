public class pattern_4{
    public static void main(String[] args){
        int n=5,count=0;
        boolean t = true, f = false;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                count++;
                if(count%2==1){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
               
            }
            System.out.println();
        }
    }
}