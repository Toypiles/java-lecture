package javabasic.class1;
public class classStart4 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade =90;

        Student student2= new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade =80;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름: "+students[0]+ " 나이: "+students[0]+" 성적: "+students[0]);
        System.out.println("이름: "+students[1]+ " 나이: "+students[1]+" 성적: "+students[1]);
    }
}
