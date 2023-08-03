package Exe4_1;
import java.util.ArrayList;
import java.util.Scanner;
public class studentmanager {
    private static String no;
    studentmanager() {
    }
    public static void find(ArrayList<student> array){
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入学号：");
            no = sc.nextLine();
            int i;

            int x = 0;
            boolean flag = false;
            for (i = 0; i < array.size(); i++) {
                if (no.equals(array.get(i).getNo())) {
                    flag = true;
                    x = i;
                    break;
                }
            }
            student s = array.get(x);
            if (flag == false) {
                System.out.println("没有找到该学生");

            } else {
                System.out.println(s.getNo() + "\t" + s.getName() + "\t" + s.getGender() + "\t"
                        + s.getAge() + "\n");

            }
        }

    public static void add(ArrayList<student> array){
        Scanner sc = new Scanner(System.in);
        String no;
        System.out.println();
        while (true) {
            System.out.print("请输入学号：");
            no = sc.nextLine();
            boolean flag = false;
            for (int i = 0; i < array.size(); i++) {
                student s = array.get(i);
                if (s.getNo().equals(no)) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                System.out.println("你输入的学号已存在，请重新输入！\n");
            else
                break;
        }
        System.out.print("请输入姓名：");
        String name = sc.nextLine();
        System.out.print("请输入性别：");
        String gender = sc.nextLine();
        System.out.print("请输入年龄：");
        String age = sc.nextLine();
        student s = new student();
        s.setNo(no);
        s.setName(name);
        s.setGender(gender);
        s.setAge(age);
        array.add(s);
        System.out.println("\n添加成功！\n");
    }
    public static void del(ArrayList<student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("请输入你要删除的学生的学号：");
        String no = sc.nextLine();
        int index = -1;
        student s = null;
        for (int i = 0; i < array.size(); i++) {
            s = array.get(i);
            if (s.getNo().equals(no)) {
                index = i;
                break;
            }
        }
        if (index == -1)
            System.out.println("\n没有查找到你所输入的学号，请检查学号是否输入正确。\n");
        else {
            System.out.println("\n你要删除的学号对应的学生信息如下，是否删除？\n输入\"1\"选择\"是\"，输入任意键选择\"否\"\n");
            System.out.println("学号\t\t姓名\t性别\t年龄\t");
            System.out.println(s.getNo() + "\t" + s.getName() + "\t" + s.getGender() + "\t"
                    + s.getAge() + "\n");
            System.out.print("请输入：");
            String j = sc.nextLine();
            switch (j) {
                case "1":
                    array.remove(index);
                    System.out.println("\n删除学号为：" + no + "的学生成功\n");
                    break;
                default:
                    System.out.println("\n删除学号为：" + no + "的学生失败\n");
                    break;
            }
        }
    }
    public static void gai(ArrayList<student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("请输入你要修改的学生的学号：");
        String no = sc.nextLine();
        int index = -1;
        student s = null;
        for (int i = 0; i < array.size(); i++) {
            s = array.get(i);
            if (s.getNo().equals(no)) {
                index = i;
                break;
            }
        }
        if (index == -1)
            System.out.println("\n没有查找到你所输入的学号，请检查学号是否输入正确。\n");
        else {
            System.out.println("\n你要修改的学号对应的学生信息如下，是否修改？\n输入\"1\"选择\"是\"，输入任意键选择\"否\"\n");
            System.out.println("学号\t\t姓名\t性别\t年龄\t");
            System.out.println(s.getNo() + "\t" + s.getName() + "\t" + s.getGender() + "\t"
                    + s.getAge() + "\n");
            System.out.print("请输入：");
            String j = sc.nextLine();
            switch (j) {
                case "1":
                    System.out.println();
                    System.out.print("请输入新姓名：");
                    String name = sc.nextLine();
                    System.out.print("请输入新性别：");
                    String gender = sc.nextLine();
                    System.out.print("请输入新年龄：");
                    String age = sc.nextLine();
                    s.setName(name);
                    s.setGender(gender);
                    s.setAge(age);
                    System.out.println("\n学号为：" + no + "的学生信息修改成功！\n");
                    break;
                default:
                    System.out.println("\n学号为：" + no + "的学生信息修改失败！\n");
                    break;
            }
        }
    }
}

