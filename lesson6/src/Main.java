import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        Course course1 = new Course("Math", 1, 50);
        Course course2 = new Course("Physics", 2, 60);


        Teacher teacher1 = new Teacher("Alice", "Brown", 40, "Female", course1);
        Teacher teacher2 = new Teacher("Bob", "Smith", 45, "Male", course2);


        Student student1 = new Student("John", "Doe", 20, "Male");
        Student student2 = new Student("Jane", "White", 22, "Female");
        Student student3 = new Student("Michael", "Johnson", 21, "Male");
        Student student4 = new Student("Emily", "Davis", 23, "Female");
        Student student5 = new Student("Chris", "Miller", 19, "Male");

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5);
        List<Teacher> teachers = Arrays.asList(teacher1, teacher2);
        Course[] course = {course1, course2};
        for(Student student : students) {
            student.addcourse(course[0]);
            student.addcourse(course[1]);
        }



        Exam exam1 = new Exam(student1, teacher1, course1);
        Exam exam2 = new Exam(student1, teacher2, course2);
        Exam exam3 = new Exam(student2, teacher1, course1);
        Exam exam4 = new Exam(student2, teacher2, course2);
        Exam exam5 = new Exam(student3, teacher1, course1);
        Exam exam6 = new Exam(student3, teacher2, course2);
        Exam exam7 = new Exam(student4, teacher1, course1);
        Exam exam8 = new Exam(student4, teacher2, course2);
        Exam exam9 = new Exam(student5, teacher1, course1);
        Exam exam10 = new Exam(student5, teacher2, course2);

        List<Course> courses = Arrays.asList(course1, course2);
        List<Exam> exams = Arrays.asList(exam1, exam2, exam3, exam4, exam5, exam6, exam7, exam8, exam9, exam10);

        // Initialize Jackson ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT); // Pretty printing

        try {
            // Writing to JSON files
            objectMapper.writeValue(new File("students.json"), students);
            objectMapper.writeValue(new File("teachers.json"), teachers);
            objectMapper.writeValue(new File("courses.json"), courses);
            objectMapper.writeValue(new File("exams.json"), exams);

            System.out.println("JSON files created successfully!");

        } catch (IOException e) {
            System.out.println("Error writing JSON files: " + e.getMessage());
        }
    }
}
