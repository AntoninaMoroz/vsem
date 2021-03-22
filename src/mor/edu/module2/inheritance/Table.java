package mor.edu.module2.inheritance;

import mor.edu.module2.design.Rectangle;

import java.util.Objects;

/**
 * @author Antonina Moroz
 * @version 1.0.0
 * @project vsem
 * @class Table
 * @since 20
 * 20.03.2021 - 20.52
 **/
public class Table extends Rectangle {

    //child fields

    private String color;
    private String material;
    private boolean isVarnished;

    //child constructors

    public Table(String color, String material, boolean isVarnished) {
        this.color = color;
        this.material = material;
        this.isVarnished = isVarnished;
    }

    public Table(int length, int width, String color, String material, boolean isVarnished) {
        super(length, width);
        this.color = color;
        this.material = material;
        this.isVarnished = isVarnished;
    }

    //child getter and setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isVarnished() {
        return isVarnished;
    }

    public void setVarnished(boolean varnished) {
        isVarnished = varnished;
    }

    // calculating the cost of the table (цена за м2 дерево пластик стекто.

    public int getTablePrice() {

        /*the cost of the table depends on the material.
         There are 3 types: wood, metal and plastic.
         Determine the cost of 1 m^2 of material:
         */

        int priceMaterial = 0;
        if (this.material == "Wood") {
            priceMaterial = 900;
        }
        else if (this.material == "Metal"){
            priceMaterial = 1400;
        }
        else if (this.material == "Plastic"){
            priceMaterial = 400;
        }
        else {
            System.out.println("Material out of stock!");
        }

        // the cost of standard colors (brown and black, or beige and white) is lower than exclusive

        int priceColor = 0;
        if (this.color == "Brown" || this.color ==  "Black") {
            priceColor = 170;
        }
        else if (this.color == "Beige" || this.color ==  "White") {
            priceColor = 220;
        }
        else {
            priceColor = 300;
        }

       // the price of varnishing is 80 UAH per m^2

        int priceOfVarnished = 0;
        if (this.isVarnished == true) {
            priceOfVarnished = 80;
        }

       // the cost of the table depends on its area and the required amount of the selected material, color and varnishing:

        return super.getArea() * (priceMaterial + priceColor + priceOfVarnished);

    }

    // Override toString () method

    @Override
    public String toString() {
        return "Table{" +
                super.toString() +
                "color='" + this.color + '\'' +
                ", material='" + this.material + '\'' +
                ", isVarnished=" + this.isVarnished +'\'' +
                ", Table price=" + getTablePrice() + "UAH" +
                '}';
    }

    public void toConsole() {
        System.out.println(super.toString());
        System.out.println(this.toString());

    }

    //Override hash() and equals() methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Table table = (Table) o;
        return isVarnished() == table.isVarnished() && Objects.equals(getColor(), table.getColor()) && Objects.equals(getMaterial(), table.getMaterial());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getColor(), getMaterial(), isVarnished());
    }
}

/* in main class:

Table t1 = new Table(1,3,"Beige","Wood",true);
        System.out.println(t1);

result:
Table{Rectangle{length=1, width=3}color='Beige', material='Wood', isVarnished=true', Table price=3600 UAH}

 */