package string.problems;

public class DuplicateWord {

    public static void main(String[] args) {

        /*
         Write a java program to find the duplicate words and their number of occurrences in the string.
            Also Find the average length of the words.
         */

        String az = "Java is a programming Language. Java is widely used language";

        int count;

        az.toLowerCase();

        String words[] = az.split(" ");
        System.out.println("Duplicate Words are :");
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {

                    count++;
                    words[j] = "0";
                    if (count > 1 && words[i] != "0")
                        for (int k = i + 1; k < words.length; k++) {
                            if (words[i].equals(words[k])) {
                                count++;

                                System.out.println(words[i]);

                            }

                        }

                }
            }

        }
    }


    }


