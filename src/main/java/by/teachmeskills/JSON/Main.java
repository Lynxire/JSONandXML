package by.teachmeskills.JSON;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("src\\main\\java\\by\\teachmeskills\\JSON\\test.json");
        Cat cat = objectMapper.readValue(file, Cat.class);
        System.out.println(cat.getAge());
    }
}
