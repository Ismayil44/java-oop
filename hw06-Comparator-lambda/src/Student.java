import java.util.Date;

public class Student implements Comparable<Student> {
    int id;
    String name;
    String surname;
    double grade;
    String gender;
    int birthyear;




    Student(int id, String name, String surname, double grade, String gender, int birthyear) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.grade = grade;
        this.gender = gender;
        this.birthyear = birthyear;

    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", birthyear=" + birthyear +
                ", name='" + name +
                ", surname='" + surname +
                ", gender=" + gender+
                ", grade=" + grade;
    }
}

