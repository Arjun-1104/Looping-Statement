import java.util.*;

public class Sentence_find_vowel{
    public static void main(String[] args){
        int count=0,i=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        while(i<str.length()){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                count++;
            }
            i++;
        }
        System.out.print("Vowel is: "+count);
    }
}