package mor.edu.module1;

/**
 * @author Antonina Moroz
 * @version 1.0.0
 * @project vsem
 * @class Palindrome
 * @since 11.03.2021 - 14.46
 **/
public class Palindrome {

    // first way to check (for !=)

    public static boolean isPalindrome1 (String text){

        text = text.replaceAll("[^A-Za-zА-Яа-я]","");
        text = text.toLowerCase();
        boolean result = true;

        for (int i = 0; i < text.length() ; i++) {

            if (text.charAt(i) != text.charAt(text.length() - 1 - i)){
                result = false;
                break;
            }
        }
        return result;
    }

    //second way to check (reverse string)

    public static boolean isPalindrome2 (String text) {

        text = text.replaceAll("[^A-Za-zА-Яа-я]", "");
        text = text.toLowerCase();
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }
        return reversed.equals(text);
    }
// third way to check (StringBuilder)

        public static boolean isPalindrome3 (String text) {

            text = text.replaceAll("[^A-Za-zА-Яа-я]","");
            text = text.toLowerCase();
            StringBuilder sb = new StringBuilder(text);
            String reversed2 = sb.reverse().toString();

            return (reversed2.equals(text));
        }

    public static void main(String[] args) {

        String text = "Я несу гусеня!";

        System.out.println("The first way :");
        System.out.println(text + " - is a palindrome - " + isPalindrome1(text));

        System.out.println("The second way :");
        System.out.println(text + " - is a palindrome - " + isPalindrome2(text));

        System.out.println("The third way :");
        System.out.println(text + " - is a palindrome - " + isPalindrome3(text));

    }
}
