package com.company;
import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;
import java.util.Scanner;
public class Huffman {
    public static void main(String[] args) {
        int [] Huffqueue=new int[100000];
        int [] q=new int[100000];
        Scanner x=new Scanner(System.in);
        int n= x.nextInt();
        int top=0;int Huffnum=0;int head=0;
        for(int i=0;i<n;++i){
            String cc= x.next();
            Huffqueue[top++]=x.nextInt();
            q[top - 1] = Huffqueue[top - 1];
        }
        Arrays.sort(Huffqueue);
        while (top != head+1) {
            int n1 = Huffqueue[head];
            Huffqueue[head]=0;
            int n2 = Huffqueue[++head];
            Huffqueue[head]=0;
            Huffqueue[head] = n1 + n2;
            Arrays.sort(Huffqueue);
            Huffnum += n1 + n2;
        }
        int m=x.nextInt();
        String[]  temp= new String[n+1];
        for(int k=0;k<m;k++) {
            String[] code = new String[66];
            int Ohuffnum = 0;
            for(int i = 0; i< n; i++) {
                temp[i] = x.next();
            }
            for (int i = 0;i < n;++i) {
                String cc= x.next();
                code[i]=temp[i];
                Ohuffnum += (int)code[i].length()* q[i];
            }
            if (Ohuffnum != Huffnum) {
                System.out.println("No\n");
            }
            else if(Ohuffnum == Huffnum) {
                int flag = 1;
                for (int i = 0;i < n;++i) {
                    for (int j = 0;j < n&& j != i ;++j) {
                        if (code[i].length()<=code[j].length()&&(code[i].equals(code[j])&&code[i].equals(code[i].length()))){
                            flag = 0;
                            break;
                        }
                        else if (code[i].length()>code[j].length()&&(code[i].equals(code[j])&&code[i].equals(code[i].length()))){
                            flag = 0;
                            break;
                        }
                    }
                    if (flag==0) break;
                }
                if (flag==1) {
                    System.out.println("Yes\n");
                } else {
                    System.out.println("No\n");
                }
            }
        }
    }
}
