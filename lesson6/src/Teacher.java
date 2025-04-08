import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Teacher extends Human {
    public Course course;

    @JsonCreator
    public Teacher(@JsonProperty("name") String name,
                   @JsonProperty("surname") String surname,
                   @JsonProperty("age") int age,
                   @JsonProperty("gender") String gender,
                   @JsonProperty("course") Course course) {
        super(name, surname, age, gender);
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void teach() {
        System.out.println(name + " is teaching");
    }


}
