package com.company;
import java.util.*;
public class Exe2_3 {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int year=x.nextInt();
        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}


