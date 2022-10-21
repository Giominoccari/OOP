class Student {
    String name;
    String surname;
    int id;
    int matriculationYear;


    void build(String n, String s, int id, int my) {
        this.name = n;
        this.surname = s;
        this.id = id;
        this.matriculationYear = my;
    }

    void printStudentInfo() {
        System.out.print("\nnome studente=" + this.name);
        System.out.print("\ncognome studente=" + this.surname);
        System.out.print("\nid studente=" + this.id);
        System.out.print("\nanno di immatricolazione=" + this.matriculationYear);
    }
}
