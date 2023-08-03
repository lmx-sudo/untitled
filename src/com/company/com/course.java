package com.company.com;
public class course {
    private String no;
    private String name;
    private String grade;
    public course(){

    }
    public course(String no, String name, String grade) {
        this.no = no;
        this.name = name;
        this.grade = grade;
    }
    public String getNo() {
        return no;
    }
    public void setNo(String no) {
        this.no = no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
}
