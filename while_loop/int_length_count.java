public class int_length_count{
    public static void main(String[] args){
        int n=45643,count = 0;
        int i = 1;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}