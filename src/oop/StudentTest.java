package oop;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.setRollNumber(1001);
        student1.setName("Huzaifa");
        student1.setAddress("pbh");

        System.out.println(student1);


        Student student2 = new Student();
        student2.setRollNumber(1002);
        student2.setName("Hamdan");

        System.out.println(student2);

        Student st3 = new Student(1003,"Osama","Katra");
        System.out.println(st3);
    }
}
