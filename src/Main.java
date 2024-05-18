import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("jan", "barej", "janbarej@gamil.com", "Młochów", "888 243 357", new Date(1980, 1, 1));
        Studenci.addStudent(s1);

        ProgramStudiow it = new ProgramStudiow("Informatyka", "Programowanie", 7, 5);

        s1.enrollStudent(it);
        s1.addGrade(5, "PGO");
        s1.addGrade(2, "TEM");

        Studenci.displayStudentInfo();

        Studenci.promoteAllStudents();

        System.out.println("Promocja:");
        Studenci.displayStudentInfo();
    }
}