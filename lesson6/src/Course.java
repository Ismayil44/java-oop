import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Course implements Gradable {
    public String name;
    public int academicYear;
    public int minimumScore;

    @JsonCreator
    public Course(@JsonProperty("name") String name,
                  @JsonProperty("academicYear") int academicYear,
                  @JsonProperty("minimumScore") int minimumScore) {
        this.name = name;
        this.academicYear = academicYear;
        this.minimumScore = minimumScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(int academicYear) {
        this.academicYear = academicYear;
    }

    public int getMinimumScore() {
        return minimumScore;
    }

    public void setMinimumScore(int minimumScore) {
        this.minimumScore = minimumScore;
    }

    @Override
    public void grade() {
        System.out.println(name + " is graded");
    }
}

