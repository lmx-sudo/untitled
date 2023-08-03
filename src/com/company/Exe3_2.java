package com.company;
import java.util.*;
public class Exe3_2 {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        double real1=a.nextDouble();
        double imag1=a.nextDouble();
        double real2=a.nextDouble();
        double imag2=a.nextDouble();
        complex x=new complex();
        complex y=new complex();
        x.real=real1;
        x.imag=imag1;
        y.real=real2;
        y.imag=imag2;
        add(x,y);
        del(x,y);
        mult(x,y);
        div(x,y);
        a.close();
    }
    static class complex{
        double real;
        double imag;
    }
    public static void add(complex x,complex y){
        System.out.println("x+y="+(x.real+y.real)+"+"+(x.imag+y.imag)+"i");
    }
    public static void del(complex x,complex y){
        System.out.println("x-y="+(x.real-y.real)+"+"+(x.imag-y.imag)+"i");
    }
    public static void mult(complex x,complex y){
        System.out.println("x*y="+(x.real*y.real-x.imag*y.imag)+"+"+(x.imag*y.real+x.real*y.imag)+"i");
    }
    public static void div(complex x,complex y){
        System.out.println("x/y="+((x.real*y.real+x.imag*y.imag)/(y.imag*y.imag+y.real*y.real))+"+"+((x.imag*y.real-x.real*y.imag)/(y.imag*y.imag+y.real*y.real))+"i");
    }
}
