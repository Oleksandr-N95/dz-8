import java.util.ArrayList;
import java.util.List;

public class Group {
    private Student lead;
    private List<Student> students;
    private List<String> tasks;

    public Group(Student lead) {
        if (lead == null) {
            System.out.println("Lead cannot be null");
            return;
        }
        this.lead = lead;
        this.students = new ArrayList<>();
        this.tasks = new ArrayList<String>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void renameStudent(Student student, String name, String sureName) {
        if (students.contains(student)) {
            student.setName(name);
            student.setSureName(sureName);
        }
    }
    public void addTask (String task) {
        tasks.add("Learn encapsulation");
        tasks.add("Learn interfaces");
        tasks.add("Learn abstractions");
    }
    public void changeLead (Student lead){
        this.lead = lead;
    }
}
