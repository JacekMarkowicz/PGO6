import java.util.ArrayList;

public class Studenci {
    private static ArrayList<Student> ListaStudentow
            = new ArrayList<>();

    public static void addStudent(Student student) {
        ListaStudentow
                .add(student);
    }
    public static void promoteAllStudents() {
        for (Student student : ListaStudentow
        ) {
            student.promoteToNextSemester();
        }
    }public static void displayStudentInfo() {
        for (Student student : ListaStudentow
        ) {
            student.displayInfo();
            System.out.println();
        }
    }
}

