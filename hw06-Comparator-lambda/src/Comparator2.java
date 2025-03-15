import java.util.Comparator;
import java.util.Objects;

public class Comparator2 implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.grade == o2.grade) {
            if (o1.birthyear == o2.birthyear) {
                if(Objects.equals(o1.gender, o2.gender)) {
                    if (Objects.equals(o1.surname, o2.surname)) {
                        if(Objects.equals(o1.name, o2.name)) {
                            return Integer.compare(o1.id, o2.id);
                        }
                        return -o1.name.compareTo(o2.name);
                    }
                    return o1.surname.compareTo(o2.surname);
                }
                return o1.gender.compareTo(o2.gender);
            }
            return Integer.compare(o1.birthyear, o2.birthyear);
        }
        return -Double.compare(o1.grade, o2.grade);
    }
}
