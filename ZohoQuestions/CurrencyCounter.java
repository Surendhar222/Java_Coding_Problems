package ZohoQuestions;

import java.util.Arrays;

public class CurrencyCounter {
	public static void main(String[] args) {
        int rupees = 1675547857;
        int[] notes = {2000,500,200,100,50,20,10,5,1};
        int[] notesCounter = new int[notes.length];
        for (int i = 0; i < notesCounter.length; i++) {
            if (rupees >= notes[i]) {
                notesCounter[i] = rupees / notes[i];
                rupees = rupees % notes[i];
            }
        }
        for (int i = 0; i < notesCounter.length; i++) {
            if (notesCounter[i] != 0) {
                System.out.println(notes[i] + ":"+ notesCounter[i]);
            }
        }
    }
}