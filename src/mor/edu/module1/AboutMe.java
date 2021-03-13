package mor.edu.module1;

/**
 * @author Antonina Moroz
 * @version 1.0.0
 * @project vsem
 * @class AboutMe
 * @since 10.03.2021 - 13.40
 **/

public class AboutMe {

    public static void main(String[] args) {

        System.out.println("Hello!");

        String myName = "My name is Antonina Moroz";
        System.out.println(myName);

        byte myAge = 21;
        System.out.println("My age is " + myAge + " years");

        short myYear = 1999;
        System.out.println("So, I was born in " + myYear);

        float myHeight = 1.6f;
        System.out.println("My height is " + myHeight + " cms ");

        double myWeight = 58.2;
        System.out.println("My weight is " + myWeight + " kgs ");

        char clothingSize = 'M';
        System.out.println("I have " + clothingSize + " clothing sizes " );

        long populationOfUkraine = 41_902_416L;
        System.out.println("The population of Ukraine is " + populationOfUkraine + " people");

        int costContract = 26000;
        System.out.println("The cost of the contract is " + costContract + " hryvnia");

        boolean myActivities = true;
        System.out.println("I am studying Java now! It is " + myActivities);




    }
}


/* result:
Hello!
My name is Antonina Moroz
My age is 21 years
So, I was born in 1999
My height is 1.6 cms
My weight is 58.2 kgs
I have M clothing sizes
The population of Ukraine is 41902416 people
The cost of the contract is 26000 hryvnia
I am studying Java now! It is true
 */
