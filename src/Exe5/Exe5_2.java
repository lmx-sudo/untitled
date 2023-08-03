package Exe5;
import java.util.Scanner;
public class Exe5_2 {
    public static void main(String[] args) {
        int count;
        count=0;
        Scanner x=new Scanner(System.in);
        String a=x.nextLine();
        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i)==' '||a.charAt(i)=='?'||a.charAt(i)=='.'||a.charAt(i)=='!'){
                if (('a'<=a.charAt(i-1)&&a.charAt(i-1)<='z')|('A'<=a.charAt(i-1)&&a.charAt(i-1)<='Z')){
                    count++;

                }
            }
        }
        System.out.println(count);
    }
}