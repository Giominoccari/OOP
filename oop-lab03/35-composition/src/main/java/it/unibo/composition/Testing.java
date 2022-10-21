package it.unibo.composition;

import javax.swing.plaf.TextUI;

public class Testing {

    public static void main(final String[] args) {

        // 1)Creare 3 studenti a piacere

        Student mario = new Student(1534, "Mario", "Rossi", "marcominoccaritestadicazzo", 2019);
        Student giovanni = new Student( 2233, "Giovanni", "Minoccari", "marcominoccarifigliodiputtana", 2020);
        Student luca = new Student(5799, "Luca", "Bianchi", "marcominoccarimuoridiocane", 2018);

        // 2)Creare 2 docenti a piacere

        String[] ponz = {"storia", "italiano", "religione"};
        Professor ponzi = new Professor(9638, "Susanna", "Ponzi", "sonounaputtana", ponz);
        String[] doc =  {"matematica", "fisica"};
        Professor dottori = new Professor(4545, "Federico", "Dottori", "marcominoccaridevemorire", doc);

        // 3) Creare due aulee di esame, una con 100 posti una con 80 posti

        ExamRoom oopLab =  new ExamRoom(80, "laboratorio oop", true, true);
        ExamRoom aulaMagna = new ExamRoom(100, "esame analisi 1", false, true);

        // 4) Creare due esami, uno con nMaxStudents=10, l'altro con
        // nMaxStudents=2

        Exam analisi1 = new  Exam(3232, 10, 0, "Analisi 1", dottori, aulaMagna, null);
        Exam labOop = new Exam(5541, 2, 0, "lab OOP", dottori, oopLab, null);

        // 5) Iscrivere tutti e 3 gli studenti agli esami

        analisi1.registerStudent(luca);
        analisi1.registerStudent(giovanni);
        analisi1.registerStudent(mario);
        labOop.registerStudent(luca);
        labOop.registerStudent(giovanni);
        labOop.registerStudent(mario);

        // 6) Stampare in stdout la rapresentazione in stringa dei due esami

        System.out.println(analisi1.toString());
        System.out.println(labOop.toString());

    }
}
