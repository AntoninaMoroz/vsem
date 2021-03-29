package mor.edu.module2.factory;

import mor.edu.module2.design.CutCone;
import mor.edu.module2.design.Cylinder;
import mor.edu.module2.design.Round;
import mor.edu.module2.polymorphism.interfaces.IGeometry;

/**
 * @author Antonina Moroz
 * @version 1.0.0
 * @project vsem
 * @class FigureFactory
 * @since 27.03.2021 - 19.23
 **/
public class FigureFactory {

    public static IGeometry create(double radius, double height){

        if (height == 0) {

            return new Round (radius);
        }
        return new Cone3 (radius,height);
    }

    public static IGeometry create(double radius1,double radius2, double height, Figures figure) {
        if (figure.equals(Figures.CUTCONE)) return new CutCone((double) radius1, (double) radius2, (double) height);
        if (figure.equals(Figures.CONE)) return new Cone3((double) radius1, (double) height);
        if (figure.equals(Figures.ROUND)) return new Round((double) radius1);
        if (figure.equals(Figures.CYLINDER)) return new Cylinder((double) radius1, (double) height);
        return null;

    }

}
