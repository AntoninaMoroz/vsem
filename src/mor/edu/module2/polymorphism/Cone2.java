package mor.edu.module2.polymorphism;

import mor.edu.module2.polymorphism.interfaces.IGeometry;
import mor.edu.module2.polymorphism.interfaces.IPacking;

import java.util.Objects;

/**
 * @author Antonina Moroz
 * @version 1.0.0
 * @project vsem
 * @class Cone
 * @since 19.03.2021 - 12.54
 **/
public class Cone2  implements IGeometry, IPacking {

    // class fields

    private double radius;
    private double height;

    // constructors

    public Cone2() {
    }

    public Cone2(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // getter and setter

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    // Override toString () method

    @Override
    public String toString() {
        return "Cone2{" +
                "radius=" + radius +
                ", height=" + height +
                '}';
    }


    //Override hash() and equals() methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cone2 cone = (Cone2) o;
        return Double.compare(cone.getRadius(), getRadius()) == 0 && Double.compare(cone.getHeight(), getHeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius(), getHeight());
    }

    // implements IGeometry

    @Override
    public double getArea() {
        return (Math.PI * this.radius * Math.sqrt(Math.pow(this.radius,2) + Math.pow(this.height,2))) +
                (Math.PI * Math.pow(this.radius,2));
    }


    @Override
    public double getVolume() {
        return (Math.PI * Math.pow(this.radius,2) * this.height)/3;
    }

    // implements IPacking

    @Override
    public String toJSON() {

        String json = "Cone" + "{" + "\"" + "radius" + "\"" + ":" + this.getRadius() +
                "," +
                "\"" + "height" + "\"" + ":" + this.getHeight() +
                "}";

        return json;
    }

    @Override
    public String toXML() {

        String xml = "<Cone>" +
                " + <radius>" + this.getRadius() + "</radius>" +
                " + <height>" + this.getHeight() + "</height>" +
                "</Cone>";

        return xml;
    }
}

