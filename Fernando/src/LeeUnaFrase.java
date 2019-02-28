import javax.swing.*;

public class LeeUnaFrase {
    public static void main(String[] args) {
        int numerodecarecteres, i, numerodeA=0;
        char letra;
        String frase;

        frase = JOptionPane.showInputDialog("introduce una frase");
        numerodecarecteres = frase.length();

        System.out.println("\nWhat is your message? " + frase);
        System.out.println("\nYour message is " + numerodecarecteres + " characters long.");
        System.out.println("The first character is at position 0 and is '" + frase.charAt(0) + "'.");
        System.out.println("The last character is at position " + (numerodecarecteres - 1) + " and is '" + frase.charAt(numerodecarecteres - 1)+ "'.");
        System.out.println("\nHere are all the characters, one at a time:\n");
        for( i = 0; i < numerodecarecteres; i++){
            System.out.println(i + " - '" + frase.charAt(i) + "'");
            letra = frase.charAt(i);
            if (letra == 'a'){
                numerodeA ++;
            }
        }
        System.out.println("\nYour message contains the letter 'a' " + numerodeA + " times. \nIsn't that interesting?");
    }
}


