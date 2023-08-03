package com.company;

public class Exe1_4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("1");
            }
            for(int k=1;k<i;k++){
                System.out.print("1");
            }
            System.out.println();
        }
        for (int i = 3; i >= 0;i--) {
            for (int j = 4-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=i;k>=0;k--){
                System.out.print("1");
            }
            for(int k=0;k<i;k++){
                System.out.print("1");
            }
            System.out.println();
        }
    }
}