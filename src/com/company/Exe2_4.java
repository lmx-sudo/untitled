package com.company;
import java.util.*;
public class Exe2_4 {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int m=n,cnt=0;
        boolean f=true;
        while(m!=0){
            m=m/10;
            cnt++;
        }int a[] ;
        a= new int[cnt];
        for(int i=0;i<cnt;i++){
            a[i]=n%10;
            n=n/10;
        }
        for(int i=0;i<cnt;i++){
            if(a[i]==a[cnt-1-i]){
               f=true;
            }
            else{
                f=false;
            }
        }
        if(f==true){
            System.out.print("yes");
        }else {
            System.out.print("no");
        }
    }
}
