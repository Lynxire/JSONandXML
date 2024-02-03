package by.teachmeskills.XML;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(Student.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Student students = (Student) unmarshaller.unmarshal(new File("src\\main\\resources\\test.xml"));
        System.out.println(students.getId() + " "+ students.getName() + " "+ students.getSurname());



        Student student = new Student();
        student.setName("Lila");
        student.setSurname("Smit");
        student.setId("1");
        Marshaller marshaller = jc.createMarshaller();
        marshaller.marshal(student, new File("src\\main\\resources\\test.xml"));
    }
}
