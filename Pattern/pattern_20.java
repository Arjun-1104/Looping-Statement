public class pattern_20{
    public static void main(String[] args){
        int n = 5;
          
    for(int i=1;i<=n;i++){
    int count = 1;
    for(int j=1;j<=n+1-i;j++){

    if(count%2==0){
    System.out.print("0 ");
    }
    else{
    System.out.print("1 ");
    }
    count++;
    }
    System.out.println();

    }
    }
}
