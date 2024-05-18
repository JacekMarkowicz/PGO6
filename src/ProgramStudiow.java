public class ProgramStudiow {
    private String nazwa;
    private String opis;
    private int numerIndeksu;
    private int maksymalnaLiczbaITN;

    public ProgramStudiow(String nazwa, String opis, int numerIndeksu, int maksymalnaLiczbaITN) {
        this.nazwa = nazwa;
        this.opis = opis;
        this.numerIndeksu = numerIndeksu;
        this.maksymalnaLiczbaITN = maksymalnaLiczbaITN;
    }

    public String getName() {
        return nazwa;
    }

    public String getDescription() {
        return opis;
    }

    public int getNumberOfSemesters() {
        return numerIndeksu;
    }

    public int getMaxITNs() {
        return maksymalnaLiczbaITN;
    }
}

