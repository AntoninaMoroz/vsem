package mor.edu.module2.design;

import java.util.Objects;

/**
 * @author Antonina Moroz
 * @version 1.0.0
 * @project vsem
 * @class Cone
 * @since 19.03.2021 - 12.54
 **/
public class Cone {

    // class fields

    private double radius;
    private double height;

    // constructor

    public Cone() {
    }

    public Cone(double radius, double height) {
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

    //1. Slant height of a cone: s = √(r^2 + h^2)

    public double getSlantHeight() {
        return Math.sqrt(Math.pow(this.radius,2) + Math.pow(this.height,2));
    }
    // 2. Lateral surface area of a cone: L = πrs = πr√(r^2 + h^2)

    public double getLateralSurfaceArea(){
        return Math.PI * this.radius * getSlantHeight();
    }
    // 3. Base surface area of a cone: B = πr^2

    public double getBaseSurfaceArea(){
        return Math.PI * Math.pow(this.radius,2);
    }
    // 4. Total surface area of a cone: A = L + B = πrs + πr^2

    public  double getTotalArea(){
        return getLateralSurfaceArea() + getBaseSurfaceArea();
    }
    // 5. Volume of a cone: V = (1/3)B * h = (1/3)πr^2h

    public double getVolume(){
        return (getBaseSurfaceArea() * this.height)/3;
    }

    // Override toString () method

    @Override
    public String toString() {
        return
                "Cone{" + "radius=" + radius + ", height=" + height + '}' +
                "Slant height of a cone = " + getSlantHeight() + " m;" +
                "Lateral surface area of a cone = " + getLateralSurfaceArea() + " m^2;" +
                "Base surface area of a cone = " + getBaseSurfaceArea() + " m^2;" +
                "Total surface area of a cone = " + getTotalArea() + " m^2;" +
                "Volume of a cone = " + getVolume() + " m^3."
                ;
    }

    //Override hash() and equals() methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cone cone = (Cone) o;
        return Double.compare(cone.getRadius(), getRadius()) == 0 && Double.compare(cone.getHeight(), getHeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius(), getHeight());
    }
}
