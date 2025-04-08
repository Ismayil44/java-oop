import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.*;
public class Student extends Human {
    public Course[] course=new Course[0];

    @JsonCreator
    public Student(@JsonProperty("name") String name,
                   @JsonProperty("surname") String surname,
                   @JsonProperty("age") int age,
                   @JsonProperty("gender") String gender) {
        super(name, surname, age, gender);
    }

    public Course[] getCourse() {
        return course;
    }

    public void setCourse(Course[] course) {
        this.course = course;
    }


    public void addcourse(Course newcourse) {
        course= Arrays.copyOf(course,course.length+1);
        course[course.length-1]=newcourse;

    }

}
