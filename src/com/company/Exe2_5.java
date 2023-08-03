package com.company;

public class Exe2_5 {
    public static void main(String args[]){
        int i,a=0,b=0;//a0=0;a1=(a0+1)*2
        for(i=5;i>0;i--){
            b=(a+1)*2;
            System.out.println(b-a);
            a=b;
        }
        System.out.println(a);
    }
}
