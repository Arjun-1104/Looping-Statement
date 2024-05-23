public class Find_N_in_fibonacci{
    public static void main(String[] args){
        int n=11,ft=0,st=1,tt=0;
        int m=n;
        while(n>1){
            tt= ft + st;
            ft = st;
            st = tt;
            n--;
        }
        System.out.print(m+" trem is: "+ft);
    }
}