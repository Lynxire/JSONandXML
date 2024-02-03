package by.teachmeskills.JSON;

import by.teachmeskills.XML.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.lang.runtime.ObjectMethods;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("src\\main\\java\\by\\teachmeskills\\JSON\\test.json");
        Student student = objectMapper.readValue(file, Student.class);
        System.out.println(student.getId());
    }
}
