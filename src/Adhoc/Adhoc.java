package Adhoc;
import java.util.*;
//College class
class College{
    private String name;
    ArrayList<Student> studentList;
    public College(String name)  //to assign college name
    {
        this.name = name;
    }
    public void setStudentList()  //To set Students list
    {
        //Create three Student objects
        Student student1 = new Student("Abe");
        Student student2 = new Student("lincoln");
        Student student3 = new Student("Abraham");
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        this.studentList = students;
    }
    public String getName()
    {
        return this.name;
    }
    public List<String> getStudentList() //To get students list
    {
        List<Student> students = this.studentList;
        List<String> names = new ArrayList<String>();
        for(Student student : students)
        {
            names.add(student.getName());
        }
        return names;
    }
}
//Student class
class Student{
    private String name;
    public Student( )  //to assign Student name
    {

    }
    public Student(String name)  //to assign Student name
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
}

class Main extends  Student{
    public static void main(String[] args) {
        //Create a College
        College college1 = new College("MIB");
        //set Student List in College Class
        college1.setStudentList();
        //Outputting the Has-a association between College and Student
        System.out.println("The students studying in " + college1.getName() + " college are " + college1.getStudentList());
    }
}
