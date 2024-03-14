package by.teachmeskills.XML;


import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@XmlRootElement(name = "shop")
public class Shop {
    private String name;
    private String product;
    private String id;

    @XmlAttribute(name = "name")
    public String getName() {
        return name;
    }
    @XmlAttribute(name = "product")
    public String getProduct() {
        return product;
    }

    @XmlAttribute(name = "id")
    public String getId() {
        return id;
    }

}
