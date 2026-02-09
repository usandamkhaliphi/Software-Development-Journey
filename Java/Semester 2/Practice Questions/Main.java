/*class Students
{
   public String name;
   public int age;
   public String gradeLevel;
   
   public Students(String n, int a, String g)
   {
      this.name = n;
      this.age = a;
      this.gradeLevel = g;
      
   }
   
   public void changegradeLevel(String newGrade)
   {
      gradelevel = newGrade;
   }
}

class School
{
   String[] students = {"John","Peter","William","Sam","Harry"};
   
   public void addStudent(String studentName)
   {
      
   
   
   
class main
{
   public static void main(String[] args)
   {
      Students School = new Students();
      
      School("John",13,
     */ 
     
import java.util.ArrayList;

// Student class
class Student {
    public String name;
    public int age;
    public String gradeLevel;

    public Student(String name, int age, String gradeLevel) {
        this.name = name;
        this.age = age;
        this.gradeLevel = gradeLevel;
    }

    public void changeGradeLevel(String newGrade) {
        this.gradeLevel = newGrade;
    }
}

// School class
class School {
    private ArrayList<Student> students;

    public School() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        for (Student s : students) {
            System.out.println("Name: " + s.name + ", Age: " + s.age + ", Grade Level: " + s.gradeLevel);
        }
    }

    public Student findStudentByName(String name) {
        for (Student s : students) {
            if (s.name.equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        School school = new School();

        // Adding students
        school.addStudent(new Student("John", 13, "7th Grade"));
        school.addStudent(new Student("Peter", 14, "8th Grade"));
        school.addStudent(new Student("William", 12, "6th Grade"));

        // Change grade level of a student
        Student studentToUpdate = school.findStudentByName("Peter");
        if (studentToUpdate != null) {
            studentToUpdate.changeGradeLevel("9th Grade");
        }

        // Display all students
        System.out.println("Student List:");
        school.displayStudents();
    }
}
