package mor.edu.module2.factory;

/**
 * @author Antonina Moroz
 * @version 1.0.0
 * @project vsem
 * @class ConeFactory
 * @since 27.03.2021 - 17.50
 **/
public class ConeFactory {
        public static Cone3 create(double radius, double height){
            if (height == 0) {
                return  null;
            }
            return new Cone3(radius,height);
        }
}
