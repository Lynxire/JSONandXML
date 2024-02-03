package by.teachmeskills.XML;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) throws JAXBException {
        Student student = new Student();
        student.setName("Lila");
        student.setSurname("Smit");
        student.setId("1");
        JAXBContext jc = JAXBContext.newInstance(Student.class);
        Marshaller marshaller = jc.createMarshaller();
        marshaller.marshal(student, new File("C:\\Users\\fined\\IdeaProjects\\JSONandXML\\src\\main\\resources\\test.xml"));
    }
}
