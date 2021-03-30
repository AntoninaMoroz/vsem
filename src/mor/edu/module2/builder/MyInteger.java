package mor.edu.module2.builder;

/**
 * @author Antonina Moroz
 * @version 1.0.0
 * @project vsem
 * @class MyInteger
 * @since 30.03.2021 - 12.05
 **/
public class MyInteger {

    public static boolean isPrime(int num){

        // determine is the number prime  or not

        for (int i = 2; i < num; i++) {
            if(num % i == 0)  {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(13));
        System.out.println(isPrime(21));
        System.out.println(isPrime(11));
        System.out.println(isPrime(31));
        System.out.println(isPrime(1001));

    }

}

/* result:
true
false
true
true
false
 */