package com.company;

public class Exe2_1 {
    public static void main(String[] args){
        for(int i=1;i<=100;i++){
            for(int j=1;j<34;j++){
                    int k=100-j-i;
                    if(i+j*3+k/3==100&&k%3==0){
                        System.out.print(i+" "+j+" "+k);
                        System.out.println("");
                    }
                }
            }
        }
    }

