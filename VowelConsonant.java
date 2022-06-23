package Day5BaseCoreProgram;

import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Alphabet : ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':

                System.out.println("Entered Alphabet " + ch + " is an Vowel");
                break;
            default:
                System.out.println("Entered Alphabet " + ch + " is a Consonant");
        }
    }
}