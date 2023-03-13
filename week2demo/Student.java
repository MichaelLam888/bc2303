package week2demo;


public class Student {
    // Attribute
    private String course;
    private String firstName;
    private String lastName;
    String cup = "Cup1";
    int age;

    // behaveiours / method / function
    public void setFirstName(String firistName1) {
        this.firstName = firistName1;
    }

    public void settLastNameAndCourse(String setlastName, String setCourse) {
        this.lastName = setlastName;
        this.course = setCourse;

    }

    public void setAge(int age){
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getCourse() {
        return this.course;
    }

    public int getAge() {
        return this.age;
    }

    public String getRemark(String remark) {
        return this.course + "Remark";
    }

}
