package mor.edu.module2.design;

import mor.edu.module2.factory.Cone3;
import mor.edu.module2.polymorphism.interfaces.IGeometry;

import java.util.Objects;

/**
 * @author Antonina Moroz
 * @version 1.0.0
 * @project vsem
 * @class Round
 * @since 29.03.2021 - 17.51
 **/
public class Round implements IGeometry{

        private double radius;

    public Round(double radius) {
        this.radius = radius;
    }

    public Round() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Round{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Round round = (Round) o;
        return Double.compare(round.getRadius(), getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius());
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius,2);
    }

    @Override
    public double getVolume() {
        return 0;
    }
}
