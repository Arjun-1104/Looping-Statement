public class fibonacci{
    public static void main(String[] args){
        int ft = 0;
        int st = 1;
        int i = 1,tt ,n=9;
        while(i<=n){
            tt = ft + st;
            System.out.println(ft);
            ft = st;
            st = tt;
            i++;
        }
    }
}