package ar.fiuba.tdd.tp1.serialization.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "cell")
public class CellXml {
    @XmlAttribute(name = "row")
    private int row;
    @XmlAttribute(name = "col")
    private int column;
    @XmlAttribute(name = "value")
    private String value;
    @XmlAttribute(name = "id")
    private String id;

    public String getId() {
        return this.id;
    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.column;
    }

    public String getValue() {
        return this.value;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
