package mor.edu.module2.polymorphism;

import mor.edu.module2.polymorphism.interfaces.IGeometry;
import mor.edu.module2.polymorphism.interfaces.IPacking;

import java.util.Objects;

/**
 * @author Antonina Moroz
 * @version 1.0.0
 * @project vsem
 * @class Rectangle
 * @since 19.03.2021 - 16.53
 **/
public class Rectangle2 implements IGeometry, IPacking {

    // class fields

    private int length;
    private int width;

    // constructors

    public Rectangle2() {
    }

    public Rectangle2(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // getter and setter

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    //Override hash() and equals() methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle2 rectangle = (Rectangle2) o;
        return getLength() == rectangle.getLength() && getWidth() == rectangle.getWidth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWidth());
    }

    // Override toString () method

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';

    }

    // implements IGeometry


    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }


    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    // implements IPacking

    @Override
    public String toJSON() {

        String json = "Reactangle" + "{" + "\"" + "length" + "\"" + ":" + this.getLength() +
                "," +
                "\"" + "width" + "\"" + ":" + this.getWidth() +
                "}";

        return json;
    }

    @Override
    public String toXML() {
       String xml = "<Rectangle>" +
               " + <length>" + this.getLength() + "</length>" +
               " + <width>" + this.getWidth() + "</width>" +
               "</Rectangle>";

        return xml;
    }
}
