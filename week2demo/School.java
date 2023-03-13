package week2demo;

public class School {
    int area;
    Student student;

    public static void main(String[] args) {
        Student student = new Student(); //make a ""student"" instance or object
        student.setFirstName("Michael");
        student.settLastNameAndCourse("Lam","JAVA");
        student.setAge(33);

        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getAge());
        System.out.println(student.getCourse());
        System.out.println(student.getRemark("ABC"));
        System.out.println(student.cup);




    }





}
