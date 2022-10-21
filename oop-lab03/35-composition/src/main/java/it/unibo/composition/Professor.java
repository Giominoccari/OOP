package it.unibo.composition;

import java.util.Arrays;

public class Professor implements User{
    
    private static final int MAX_COURSE = 15;
    private static final String DOT = ".";
    private final int id;
    private final String name;
    private final String surname;
    private final String password;
    private String[] courses = new String[MAX_COURSE];

    public Professor(
    final int id,
    final String name,
    final String surname,
    final String password,
    String[] courses){
        this.name = name;
        this.surname  = surname;
        this.password  = password;
        this.id = id;
        this.courses = courses;
    }

    public void replaceCourse(final String course, int index){
        this.courses[index] = course;
    }
    public void replaceAllCourses(String[] courses){
        for(int i = 0; i < MAX_COURSE; i++){
            this.courses[i] = courses[i];
        }
    }

    public String getUsername(){
        return this.name;
    }

    public String getPassword(){
        return this.password;
    }

    public String toString() {
        String a = "Professor ["
            + "name=" + this.name
            + ", surname=" + this.surname
            + ", id=" + this.id
            + "]";
        String b = Arrays.toString(courses);
        return a + b;
    }

    public String getDescription(){
        return this.toString();
    }

}
