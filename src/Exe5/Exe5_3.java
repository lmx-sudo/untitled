package Exe5;
import java.util.ArrayList;
import java.util.Scanner;
public class Exe5_3 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int number=x.nextInt();
        ArrayList<student> list=new ArrayList<>();
        for (int i = 0; i < number; i++) {
            student student=new student();
            student.setGrade(x.nextDouble());
            list.add(student);
        }
        for (int i = 0; i < list.size()-1; i++) {
            for (int k = 0; k < list.size()-i-1; k++) {
                if(list.get(i).getGrade()<list.get(i+1).getGrade()){
                    swap(list.get(i),list.get(i+1));
                }
            }
        }
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i-1).getGrade()==list.get(i).getGrade()){
                list.get(i).setRanking(list.get(i-1).getRanking());
            }else {
                list.get(i).setRanking(i+1);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            int a=(int) list.get(i).getGrade();
            if(a==list.get(i).getGrade()){
                System.out.println(a+"\t"+list.get(i).getRanking());
            }else {
                System.out.println(list.get(i).getGrade()+"\t"+list.get(i).getRanking());
            }

        }
    }
    public static void swap(student a,student b){
        double c=a.getGrade();
        a.setGrade(b.getGrade());
        b.setGrade(c);
    }
}
class student {
    private int ranking = 1;
    private double grade;

    public student() {
    }

    public student(int ranking, double grade) {
        this.ranking = ranking;
        this.grade = grade;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }


    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}