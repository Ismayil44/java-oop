import java.util.Random;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Exam {
    public Student student;
    public Teacher teacher;
    public Course course;
    public String grade;

    @JsonCreator
    public Exam(@JsonProperty("student") Student student,
                @JsonProperty("teacher") Teacher teacher,
                @JsonProperty("course") Course course) {
        this.student = student;
        this.teacher = teacher;
        this.course = course;
        this.grade=result();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }


    String[] grades = {"A", "B", "C", "D", "E", "F"};
    Random random=new Random();
    double score=random.nextDouble(1,101);

    public String result() {
        try {
            int n = 0;
            for (int i = 90; i == course.minimumScore; i -= 10) {
                if (score > i) {
                    String grade = grades[n];
                    break;
                }
                n++;
            }
            System.out.println(student.name + "'s grade is " + grades[n]);
            grade = grades[n];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(student.name + " is failed");
            grade="failed";
        }
        return grade;
    }

}
