package oop.basics;

class Subject {
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;
    
    public Subject(String subID,String name,int maxMarks) {
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
    }
    public String getSubID(){return subID;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtain(){return marksObtain;}
    
    public void setMaxMarks(int mm) { maxMarks=mm; }
    public void setMarksObtain(int m) { marksObtain = m; }
    boolean isQualified() { return marksObtain >= maxMarks/10*4; }
    public String toString() { 
        return "Subject ID: "+subID+"\tName: "+name+"\tMarks Obtained: "+marksObtain;
    }
}

class StudentWithDependency {
    private String rollNo;
    private String name;
    private String dept;
    private int numOfSub;
    private Subject subjects[];

    public StudentWithDependency(String roll, String name) {
         this.rollNo=roll;
         this.name=name;       
    }
    public StudentWithDependency(String roll, String name, String dept) {
        this.rollNo=roll;
        this.name=name;  
        this.dept=dept;         
   }
    public StudentWithDependency(String roll, String name, int ns) {
         this.rollNo=roll;
         this.name=name;
         this.numOfSub=ns;
    }
    
    public String getRollNo(){ return rollNo; }
    public String getName(){ return name; }
    public String getDept(){ return dept; }
    public int getNoOfSubjects(){ return numOfSub; }
    public Subject[] getSubjects(){ return subjects; }
    
    public void setDept(String dept) { this.dept=dept; }
    public void setSubjects(Subject ...subs) {
    	if (this.subjects == null) this.subjects = subs;
    	else for(int i=0;i<subs.length;i++) { this.subjects[i]=subs[i]; }
    }
    
    public String toString() {
        return "Roll: " +rollNo+"\tName: "+name+"\tDept: "+dept;
    }
}

public class ClassExample02 {
    public static void main(String[] args) {
//    	StudentWithDependency student = new StudentWithDependency("1", "Javist");
    	StudentWithDependency student = new StudentWithDependency("1", "Javist", "CS");
    	System.out.println(student.toString());
    	
        Subject subs[]=new Subject[3];
        subs[0]=new Subject("s101","DS",100);
        subs[1]=new Subject("s102","Algorithms",100);
        subs[2]=new Subject("s103","Operating Systems",100);
//        for(Subject s:subs) { System.out.println(s); } // DBG
        
        student.setSubjects(subs);
        for(Subject s:student.getSubjects()) { System.out.println(s); }
    }
}