package com.company;
public class Exe1_6 {
    public static void main(String[] args) {
        int cnt=0;
        for(int i=2;i<=10000;i++){
            boolean f=true;
            for(int j=2;j<i;j++){
                if (i % j == 0) {
                    f=false;
                }
            }
            if (f==true){
                System.out.print(i+"\t");
                cnt++;
            }
        }
        System.out.println();
        System.out.println(cnt);
    }
}
