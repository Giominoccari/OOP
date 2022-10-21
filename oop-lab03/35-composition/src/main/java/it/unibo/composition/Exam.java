package it.unibo.composition;

import java.util.Arrays;

public class Exam {
    private final int id;
    private final int maxStudent;
    private int registeredStudent;
    private final String courseName;
    private final Professor professor;
    private final ExamRoom room;
    Student[] students;

    public Exam(final int id, final int maxStudent, final int registeredStudent, final String courseName, final Professor professor, final ExamRoom room, final Student[] students){
        this.id = id;
        this.maxStudent = maxStudent;
        this.registeredStudent = registeredStudent;
        this.courseName = courseName;
        this.professor = professor;
        this.room =  room;
        this.students = new Student[this.maxStudent];
        for(int i = 0; i < registeredStudent; i++){
            this.students =  students;
        }
    }

    public String GetCourseName(){
        return this.courseName;
    }

    public Professor GetProfessor(){
        return this.professor;
    }

    public int GetRegisteredStudent(){
        return this.registeredStudent;
    }

    public int GetMaxStudent(){
        return this.maxStudent;
    }

    public int GetExamId(){
        return this.id;
    }

    public ExamRoom GetExamRoom(){
        return this.room;
    }

    public Student[] GetExamStudents(){
        return this.students;
    }

    public void registerStudent(Student student){
        if(this.registeredStudent < this.maxStudent){
            this.students[this.registeredStudent] = student;
            this.registeredStudent++;
        }
        return;
    }

    public String toString(){
        return "Exam = [" +
        "\ncourse name = " + this.GetCourseName() +
        "\nprofessor = " + this.GetProfessor() +
        "\nroom numero = " + this.GetExamRoom() +
        "\nid room = " + this.GetExamId() +
        "\nmax students = " + this.GetMaxStudent() +
        "\nregistered students = " + this.GetRegisteredStudent() +
        "\nstudenti registrati = " + Arrays.toString(this.GetExamStudents());
    }

    
}

