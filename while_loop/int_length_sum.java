public class int_length_sum{
    public static void main(String[] args){
        int n = 123456,sum = 0,r=0;

        while(n>0){
            r=n%10;
            sum = sum + r;
            n=n/10;

        }
        System.out.print(sum);
    }
}