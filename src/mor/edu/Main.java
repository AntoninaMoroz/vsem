package mor.edu;

import mor.edu.module2.design.Cone;
import mor.edu.module2.inheritance.Person;
import mor.edu.module2.inheritance.Table;
import mor.edu.module2.polymorphism.Cone2;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Java !");

        Cone c1 = new Cone(4,9);
        Cone c2 = new Cone();
        double r1 = c1.getRadius();
        System.out.println(r1);
        c2.setRadius(2);
        c2.setHeight(8);
        System.out.println(c2.toString());

        Cone c3 = new Cone(4,9);
        System.out.println(c1.equals(c3));

        System.out.println("Slant height of a cone = " + c3.getSlantHeight() + " m");
        System.out.println("Lateral surface area of a cone = " + c3.getLateralSurfaceArea() + " m^2");
        System.out.println("Base surface area of a cone = " + c3.getBaseSurfaceArea() + " m^2");
        System.out.println("Total surface area of a cone = " + c3.getTotalArea() + " m^2");
        System.out.println("Volume of a cone = " + c3.getVolume() + " m^3");

        System.out.println(c3.toString());


        Person p1 = new Person();

        Table t1 = new Table(1,3,"Beige","Wood",true);
        System.out.println(t1);

        Cone2 c22 = new Cone2(2,5);
        System.out.println(c22.toJSON());
        System.out.println(c22.toXML());




    }
}
