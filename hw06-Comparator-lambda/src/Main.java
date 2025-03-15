import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        Student student1= new Student(51,"abc","have",53,"male",2005
        );

        Student student2= new Student(51,"def","have",54,"male",2005
        );
        students[0]=student1;
        students[1]=student2;

        Comparator<Student> comparator1=(o1,o2)->{
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
        };

        Comparator2 comparator = new Comparator2();
        Arrays.sort(students, comparator1);//with lambda
        //Arrays.sort(students, comparator); //with comparator class
        for (Student student : students) {
            System.out.println(student);
        }





    }
}
