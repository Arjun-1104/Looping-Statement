public class Reverse_int_num{
    public static void main(String[] args){
        int n=123456,count=0;

        while(n>0){
            int d = n%10;
            count = count*10 +d;
            n=n/10;
        }
        System.out.print(count);
    }
}