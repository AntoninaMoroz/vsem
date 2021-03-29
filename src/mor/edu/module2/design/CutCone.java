package mor.edu.module2.design;

import mor.edu.module2.polymorphism.interfaces.IGeometry;

import java.util.Objects;

/**
 * @author Antonina Moroz
 * @version 1.0.0
 * @project vsem
 * @class CutCone
 * @since 27.03.2021 - 19.53
 **/
public class CutCone implements IGeometry {

    private double radius1;
    private double radius2;
    private double height;

    public CutCone() {
    }

    public CutCone(double radius1, double radius2, double height) {
        this.radius1 = radius1;
        this.radius2 = radius2;
        this.height = height;
    }

    public double getRadius1() {
        return radius1;
    }

    public void setRadius1(double radius1) {
        this.radius1 = radius1;
    }

    public double getRadius2() {
        return radius2;
    }

    public void setRadius2(double radius2) {
        this.radius2 = radius2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "CutCone{" +
                "radius1=" + radius1 +
                ", radius2=" + radius2 +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CutCone cutCone = (CutCone) o;
        return Double.compare(cutCone.getRadius1(), getRadius1()) == 0 && Double.compare(cutCone.getRadius2(), getRadius2()) == 0 && Double.compare(cutCone.getHeight(), getHeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius1(), getRadius2(), getHeight());
    }

    @Override
    public double getArea() {
        return Math.PI * (((Math.pow(this.radius1, 2) + Math.pow(this.radius2, 2))) +
                (this.radius1 + this.radius2) * this.height);
    }

    @Override
    public double getVolume() {
        return 0;
    }
}
