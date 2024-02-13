package by.teachmeskills.XML;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(Shop.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Shop students = (Shop) unmarshaller.unmarshal(new File("src\\main\\resources\\test.xml"));
        System.out.println(students.getId() + " "+ students.getName() + " "+ students.getSurname());



        Shop shop = new Shop();
        shop.setName("Lila");
        shop.setSurname("Smit");
        shop.setId("1");
        Marshaller marshaller = jc.createMarshaller();
        marshaller.marshal(shop, new File("src\\main\\resources\\test.xml"));
    }
}
