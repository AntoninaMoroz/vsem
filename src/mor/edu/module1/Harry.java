package mor.edu.module1;

/**
 * @author Antonina Moroz
 * @version 1.0.0
 * @project vsem
 * @class Harry
 * @since 12.03.2021 - 12.30
 **/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Harry {

    public static void main(String[] args) throws IOException {

        // download a text version of a novel about Harry Potter to string

     String text = new String(Files.readAllBytes(Paths.get("/Users/User/Desktop/Java/harry.txt")));

        // clean from a punctuation signs

        text = text.replaceAll("[^A-Za-z ']","");

        // split the novel into an array of words

        String[] words = text.split(" ");

        // create another array containing distinct words

        String stringOfDistincts = "";

        for (int i = 0; i < words.length; i++) {

            if (!stringOfDistincts.contains(words[i])) {
                stringOfDistincts += words[i] + " ";
            }
        }
        String[] distincts = stringOfDistincts.split(" ");

        // order the words in alphabetic order

        Arrays.sort(distincts);

        for (int i = 0; i < 100 ; i++) {

            System.out.println(distincts[i]);
        }
    }

    /* result
    'Alohomora
'Atta
'Cause
'Course
'Dumbledore
'Harry's
'Jordan
'Mr
'NMat
'Oh
'Pig
'Quidditch'
'Scuse
'Snot
'Up'
'Yes
'You
'YouKnowWho'
'cause
'cept
'f'
'gar'
'hocus
'm'
'please'
's'
'smatter
'there's
'til
'to
'undred
'wand
AAAAAAAAAARGH
ALBUS
ALL
ALLEY
ALLOWED
AM
AND
ANYTHING
AT
Aaah
Aargh
Abbott
Abou'
About
Absolutely
According
Adalbert
Add
Adrian
Africa
African
After
Against
Ages
Agrippa
Ah
Aha
Ahead
Ahem
Ahern
Alas
Alberic
Albus
Algie
Alicia
All
Alley
Although
Always
Am
An'
And
Angelina
Another
AntiCheating
AntiDark
Anyone
Anythin'
Anything
Anyway
Apothecary
Are
Aren't
Argus
Around
Arsenius
Arts
As
Asked
Astronomy
At
Ate
August
Aunt
Auntie
BC
BED
BEHIND
     */








}
