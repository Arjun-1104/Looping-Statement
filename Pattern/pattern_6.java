
/*
public class pattern_6{
    public static void main(String[] args){
        int n=7,temp;

        for(int i=1;i<=n;i++){
            temp=i;

            for(int j=1;j<=i;j++){
                System.out.print(temp+" ");
                temp = temp+n-j;
            }
            System.out.println();
        }
            
    }
}
*/
public class pattern_6{
    public static void main(String[] args){
        int n=5;

        for(int i=1;i<=n;i++){
            int print = i;
            int diff = n-1;

            for(int j=1;j<=i;j++){
                System.out.print(print+"  ");
                print = print + diff;
                diff--;
            }
            System.out.println();
        }
    }
}
