public class OOPs {
    public static void main(String[] args) {
        Student student1 = new Student(12,"madh", 88.5f);

        System.out.println(student1.marks);
        System.out.println(student1.name);
    }
}

class Student{
    int rollNo;
    String name;
    float marks;

    Student(int rollNo, String name, float Marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = Marks;
    }
}
