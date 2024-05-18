import java.util.ArrayList;
import java.util.Date;

public class Student {
    private static int liczbaIndeksow = 1;
    private String imie;
    private String nazwisko;
    private String email;
    private String address;
    private String telefon;
    private Date dataUrodzenia;
    private String numerIndeksu;
    private ProgramStudiow ProgramStudiow;
    private int obecnysemestr;
    private String status;
    private ArrayList<String> oceny;
    private int LiczbaITN;

    public Student(String imie, String nazwisko, String email, String address, String telefon, Date dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.address = address;
        this.telefon = telefon;
        this.dataUrodzenia = dataUrodzenia;
        this.numerIndeksu = "s" + liczbaIndeksow++;
        this.obecnysemestr = 1;
        this.status = "Candidate";
        this.oceny = new ArrayList<>();
        this.LiczbaITN = 0;
    }

    public String getFirstName() {
        return imie;
    }

    public String getLastName() {
        return nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return telefon;
    }

    public Date getBirthDate() {
        return dataUrodzenia;
    }

    public String getIndexNumber() {
        return numerIndeksu;
    }

    public int getCurrentSemester() {
        return obecnysemestr;
    }

    public String getStatus() {
        return status;
    }

    public void enrollStudent(ProgramStudiow ProgramStudiow) {
        this.ProgramStudiow = ProgramStudiow;
        this.status = "Student";
    }

    public void addGrade(int grade, String subject) {
        oceny.add(subject + ": " + grade);
        if (grade < 3) {
            LiczbaITN++;
        }
    }

    public void promoteToNextSemester() {
        if (status.equals("Graduate")) {
            return;
        }
        if (LiczbaITN > ProgramStudiow.getMaxITNs()) {
            System.out.println("Student " + numerIndeksu + " has too many ITNs and cannot be promoted.");
            return;
        }
        if (obecnysemestr < ProgramStudiow.getNumberOfSemesters()) {
            obecnysemestr++;
        } else {
            status = "Graduate";
        }
    }

    public void displayInfo() {
        System.out.println("Student: " + imie + " " + nazwisko + " (" + numerIndeksu + ")");
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Telefon: " + telefon);
        System.out.println("Data urodzenia: " + dataUrodzenia);
        System.out.println("Program: " + (ProgramStudiow != null ? ProgramStudiow.getName() : "None"));
        System.out.println("Obecny semestr: " + obecnysemestr);
        System.out.println("Status: " + status);
        System.out.println("Oceny: " + oceny);
    }
}
