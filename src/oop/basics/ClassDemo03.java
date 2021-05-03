package oop.basics;

class Student {
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;
    
    public int total() { return m1+m2+m3; }
    public float average() {
        return (float)total()/3;
    }
    public char grade() {
        if(average()>=70) { return 'A'; }
        if(average()>=60) { return 'B'; }
        if(average()>=50) { return 'C'; }
        if(average()>=40) { return 'D'; }
        else { return 'F'; }
    }
    public String toString() {
        return "Roll No:"+roll+"\n"+"Name:"+name+"\n"+"Course:"+course+"\n";
    }
}

public class ClassDemo03 {
    public static void main(String[] args) {
        Student s=new Student();
        
        s.roll=1;
        s.name="John";
        s.course="CS";
        s.m1=70;
        s.m2=80;
        s.m3=65;
        
        System.out.println("Total :"+s.total());
        System.out.println("Average :"+s.average());
        
        System.out.println("Details:\n "+ s );
    }
}