package com.company;
import java.util.*;
public class Exe3_3 {
    public static void main(String args[])
    {
        Scanner z=new Scanner(System.in);
        double x= z.nextDouble();
        double y= z.nextDouble();
        double x1= z.nextDouble();
        double y1= z.nextDouble();
        double x2= z.nextDouble();
        double y2= z.nextDouble();
        point a=new point(x,y);
        line b=new line(x1,y1,x2,y2);
        System.out.println("直线的长为："+b.zhouchang());
        circle c=new circle(5);
        System.out.println("圆的周长为："+c.zhouchang());
        System.out.println("圆的面积为："+c.mianji());
        rectangle d=new rectangle(4,8);
        System.out.println("矩形的周长为："+d.zhouchang());
        System.out.println("矩形的面积为："+d.mianji());
        triangle e=new triangle(3,4,5);
        System.out.println("三角形的周长为："+e.zhouchang());
        System.out.println("三角形的面积为："+e.mianji());
    }
}
class point
{
    private double x;
    private double y;
    public point(double x,double y)
    {
        this.x=x;
        this.y=y;
    }

}
class line {
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    public line (double x1,double y1,double x2,double y2){
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }
    public double zhouchang()
    {
        return  Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }
}
class circle{
    private double r;
    public circle(double r){
        this.r=r;
    }
    public double zhouchang(){
        return 2*3.14*r;
    }
    public double mianji(){
        return 3.14*r*r;
    }
}
class rectangle{
    private double width;
    private double height;
    public rectangle(double width ,double height){
        this.width=width;
        this.height=height;
    }
    public double zhouchang(){
        return 2*(width+height);
    }
    public double mianji(){
        return width*height;
    }
}
class triangle{
    private double a;
    private double b;
    private double c;
    public triangle(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double zhouchang(){
        return a+b+c;
    }
    public double mianji(){
        double p=(a+b+c)/2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
