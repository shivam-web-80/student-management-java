import java.util.*;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully.");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void searchStudent(int rollNo) {
        for (Student s : students) {
            if (s.rollNo == rollNo) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void deleteStudent(int rollNo) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.rollNo == rollNo) {
                iterator.remove();
                System.out.println("Student deleted.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}

