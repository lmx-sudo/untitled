package Exe4_2;

import java.util.ArrayList;
import java.util.Scanner;
public class coursemanager {
    coursemanager() {
    }
    public static course find(ArrayList<course> array) {
        Scanner sc = new Scanner(System.in);
        String no;
        System.out.print("请输入课程号：");
        no = sc.nextLine();
        int i;
        int x = 0;
        boolean flag = false;
        for (i = 0; i < array.size(); i++) {
            if (no.equals(array.get(i).getNum())) {
                flag = true;
                x = i;
                break;
            }
        }
        course s = array.get(x);
        if (flag == false) {
            System.out.println("没有找到该课程");
        } else {
            System.out.println("课程号"+s.getNum() + "\t课程名字" + s.getName() + "\t学分" + s.getGrade() + "\n");
        }
        return s;
    }
    public static void add(ArrayList<course> array){
        Scanner sc = new Scanner(System.in);
        String num;
        System.out.println();
        while (true) {
            System.out.print("请输入课程号：");
            num = sc.nextLine();
            boolean flag = false;
            for (int i = 0; i < array.size(); i++) {
                course s = array.get(i);
                if (s.getNum().equals(num)) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                System.out.println("你输入的课程号已存在，请重新输入！\n");
            else
                break;
        }
        System.out.print("请输入课程名字：");
        String name = sc.nextLine();
        System.out.print("请输入学分：");
        String grade = sc.nextLine();
        course s = new course();
        s.setNum(num);
        s.setName(name);
        s.setAge(grade);
        array.add(s);
        System.out.println("\n添加成功！\n");
    }
    public static void del(ArrayList<course> array){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("请输入你要删除的课程号：");
        String num = sc.nextLine();
        int index = -1;
        course s = null;
        for (int i = 0; i < array.size(); i++) {
            s = array.get(i);
            if (s.getNum().equals(num)) {
                index = i;
                break;
            }
        }
        if (index == -1)
            System.out.println("\n没有查找到你所输入的课程号，请检查课程号是否输入正确。\n");
        else {
            System.out.println("\n你要删除的课程号对应的课程信息如下，是否删除？\n输入\"1\"选择\"是\"，输入任意键选择\"否\"\n");
            System.out.println("课程号\t课程名字\t学分\t\t");
            System.out.println(s.getNum() + "\t" + s.getName() + "\t" + s.getGrade() + "\n");
            System.out.print("请输入：");
            String j = sc.nextLine();
            switch (j) {
                case "1":
                    array.remove(index);
                    System.out.println("\n删除课程号为：" + num + "的课程成功\n");
                    break;
                default:
                    System.out.println("\n删除课程号为：" + num + "的课程失败\n");
                    break;
            }
        }
    }
    public static void gai(ArrayList<course> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("请输入你要修改的课程号：");
        String num = sc.nextLine();
        int index = -1;
        course s = null;
        for (int i = 0; i < array.size(); i++) {
            s = array.get(i);
            if (s.getNum().equals(num)) {
                index = i;
                break;
            }
        }
        if (index == -1)
            System.out.println("\n没有查找到你所输入的课程号，请检查课程号是否输入正确。\n");
        else {
            System.out.println("\n你要修改的课程号对应的课程信息如下，是否修改？\n输入\"1\"选择\"是\"，输入任意键选择\"否\"\n");
            System.out.println("课程号\t\t课程名\t学分\t");
            System.out.println(s.getNum() + "\t" + s.getName() + "\t" + s.getGrade() +  "\n");
            System.out.print("请输入：");
            String j = sc.nextLine();
            switch (j) {
                case "1":
                    System.out.println();
                    System.out.print("请输入新课程名：");
                    String name = sc.nextLine();
                    System.out.print("请输入新学分：");
                    String grade = sc.nextLine();
                    s.setName(name);
                    s.setAge(grade);
                    System.out.println("\n课程号为：" + num + "的课程信息修改成功！\n");
                    break;
                default:
                    System.out.println("\n课程号为：" + num + "的课程信息修改失败！\n");
                    break;
            }
        }
    }
}

