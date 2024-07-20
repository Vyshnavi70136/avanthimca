public class Student {

 private static long nextID=10000000;
 private long studentID;
 //etc..

 public Student (String name, long studentID, int count, double total score) {
        totalScore=0;
        count=0;
        this.name=name;
        studentID=nextID;
        nextID++;

 }

 public long getStudentID() {
       return nextID;`
 }