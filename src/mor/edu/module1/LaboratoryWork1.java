package mor.edu.module1;

/**
 * @author Antonina Moroz
 * @version 1.0.0
 * @project vsem
 * @class LaboratoryWork1
 * @since 15.03.2021 - 18.06
 **/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LaboratoryWork1 {

    public static void main(String[] args) throws IOException {

        // download a text version of a novel about Harry Potter to string

        String text = new String(Files.readAllBytes(Paths.get("/Users/User/Desktop/Java/harry.txt")));

        //Count the LINES where the word "Harry" is met.

        String[] lines = text.split("\\n");

        int counter = 0;

        for (int i = 0; i < lines.length; i++) {
            if (lines[i].contains("Harry")) {
                counter++;
            }
        }
        System.out.println(counter);

        //Find the longest word in the above text.

        text = text.replaceAll("[^A-Za-z ']", "");

        String[] words = text.split(" ");

        int maxLength = 0;
        String maxWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxLength){
                maxLength = words[i].length();
                maxWord = words[i];
            }
        }
        System.out.println(maxWord);

        //Take the array of distinct words from Harry Potter .

        String stringOfDistincts = "";

        for (int i = 0; i < words.length; i++) {

            if (!stringOfDistincts.contains(words[i])) {
                stringOfDistincts += words[i] + " ";
            }
        }
        String[] distincts = stringOfDistincts.split(" ");

     // How many distinct words begin from the letter "C".

        int wordC = 0;

        for (int i = 0; i < distincts.length; i++) {
            if (distincts[i].startsWith("C")) {
                wordC++;
            }
        }
        System.out.println(wordC);

        //Create an array of hashes.

        int[] hashes = new int[distincts.length];
        for (int i = 0; i < distincts.length; i++) {
            hashes[i] = distincts[i].hashCode();
        }
        for (int i = 0; i < 100; i++) {

            System.out.println(hashes[i]);
        }
    }
}

/* result:
1084
interestinglooking
80
69496448
-1898553908
96727
114801
-409322317
80218181
1456998445
78406
83025
65964
85918
72447192
2501
77646
-615834066
3543
-1034364087
3149094
-1896109122
66300266
3645825
106940924
113643
3558823
3558952
471465562
-1039745817
110323434
119839
3616054
3362829
2605640
3314326
-991808881
115166588
-1289163687
636733255
-330473854
-1881997444
1827208126
-232973818
3273964
-1331996356
3208383
3649734
3541575
1422799105
117481
246043532
3143230
-1367775363
1349413851
113101341
3343637
-1323535496
2333
97536
93614293
107866
-1224458312
3377247
2035477926
3195240
102742843
853982760
-1386154518
103051
-1049482315
110777640
111593474
-1413853096
3046006
-836041066
113840
109642094
3676
103189
3560141
1025237382
3423444
-1253087691
-1278142878
-895471450
425173953
-1910986747
109548807
114066
2057920365
110327130
-1259490430
110327396
97436152
97740
-327707013
401590963
-795125073
97921
2997191
-906277200
201724889

Process finished with exit code 0

 */