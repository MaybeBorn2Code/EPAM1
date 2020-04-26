package HomeWork2;

public class Student {
    private String name;
    private String surname;
    private double averageGrade;

    public Student(final String name, final String surname, final double averageGrade) {
        this.name = name;
        this.surname = surname;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public double getAverageGrade() {
        return this.averageGrade;
    }

    public void setAverageGrade(final double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{name='" + this.name + '\'' + ", surname='" + this.surname + '\'' + ", averageGrade=" + this.averageGrade + '}';
    }
}