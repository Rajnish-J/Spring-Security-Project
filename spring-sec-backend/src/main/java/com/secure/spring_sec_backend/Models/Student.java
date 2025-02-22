package com.secure.spring_sec_backend.Models;


public class Student {

    private int sid;
    private String sName;

    public Student(int sid, String sName) {
        this.sid = sid;
        this.sName = sName;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sName='" + sName + '\'' +
                '}';
    }
}
