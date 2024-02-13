package by.teachmeskills.XML;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "shop")
public class Shop {
    private String name;
    private String product;
    private String id;

    @XmlAttribute(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @XmlAttribute(name = "product")
    public String getSurname() {
        return product;
    }

    public void setSurname(String product) {
        this.product = product;
    }

    @XmlAttribute(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
