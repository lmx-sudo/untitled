package Exe4_2;
import java.util.*;
public class ui {
    public static void main(String[] args) {
        ArrayList<course> array = new ArrayList<course>();
        while (true) {
            System.out.println("欢迎进入课程管理系统,请输入对应数字来选择操作");
            System.out.println("1查找");
            System.out.println("2添加");
            System.out.println("3删除");
            System.out.println("4修改");
            System.out.println("5退出");
            Scanner sc = new Scanner(System.in);
            int op = sc.nextInt();
            switch (op) {
                case 1: {
                    coursemanager.find(array);
                    break;
                }
                case 2: {
                    coursemanager.add(array);

                    break;
                }
                case 3: {
                    coursemanager.del(array);
                    break;
                }
                case 4: {
                    coursemanager.gai(array);
                    break;
                }
                case 5: {
                    System.out.println("退出系统成功\n");
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("\n输入错误，请重新选择！\n");
                    break;
            }
        }
    }
}