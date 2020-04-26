package HomeWork2;


import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Student> students;

    public Group() {
        this.students = new ArrayList<Student>();
    }

    public void add(final Student newStudent) {
        this.students.add(newStudent);
    }

    public void delete(final Student newStudent) {
        this.students.remove(newStudent);
    }

    public void changeStudentName(final Student newStudent, final String reName) {
        newStudent.setName(reName);
    }

    public void changeStudentSurname(final Student newStudent, final String newSurname) {
        newStudent.setSurname(newSurname);
    }

    public void changeStudentCourse(final Student newStudent, final double newAverageGrade) {
        newStudent.setAverageGrade(newAverageGrade);
    }

    public void printAllStudents() {
        for (final Student student : this.students) {
            System.out.println(student);
        }
    }
}