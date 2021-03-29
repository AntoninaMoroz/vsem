package mor.edu.module2.design;

import mor.edu.module2.polymorphism.interfaces.IGeometry;

import java.util.Objects;

/**
 * @author Antonina Moroz
 * @version 1.0.0
 * @project vsem
 * @class Cylinder
 * @since 29.03.2021 - 21.05
 **/
public class Cylinder implements IGeometry {

        private double radius;
        private double height;

    public Cylinder() {
    }


    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

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


    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cylinder cylinder = (Cylinder) o;
        return Double.compare(cylinder.getRadius(), getRadius()) == 0 && Double.compare(cylinder.getHeight(), getHeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius(), getHeight());
    }
}
