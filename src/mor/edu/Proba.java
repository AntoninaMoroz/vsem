package mor.edu;

import java.util.Arrays;

/**
 * @author Antonina Moroz
 * @version 1.0.0
 * @project vsem
 * @class Proba
 * @since 14.03.2021 - 14.14
 **/
public class Proba {

    public static void main(String[] args) {

        int[] arrInt = {4, 8, 9, 3, 11};
        Arrays.sort(arrInt);
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println(arrInt[i]);
        }
    }
}
