package com.company;
class Exe1_3{
    public static void main(String[] args) {
        char c[]={'J','a','v','a'};
        for(int i=0;i<4;i++){
            int b=c[i]+2;
            char a=(char)b;
            int d=(a^c[i]);
            char m=(char)d;
            System.out.println(m);
        }

    }
}
