package com.company;
public class Exe2_2 {
    public static void main(String[] args) {
        double pi=0,f = 1;;
    for(int i = 1;i<1000000;i=i+2)
        {
            pi += (4.0 / i * f);
            f = -f;
        }
    System.out.print(pi);
    }
}

