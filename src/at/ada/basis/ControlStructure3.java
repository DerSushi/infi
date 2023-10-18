package at.ada.basics;

import java.util.Random;

public class ControlStructure3 {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 5 und 10
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        // Wenn der Wert 10 ist gib aus Ten
        // Wenn der Wert 9 ist gib aus Nine
        // Wenn der Wert 8 ist gib aus Eight
        // etc.
        switch(randomNumber){
            case 0:
                System.out.println("deine Zahl ist 0");
                break;
            case 1:
                System.out.println("deine Zahl ist 1");
                break;
            case 2:
                System.out.println("deine Zahl ist 2");
                break;
            case 3:
                System.out.println("deine Zahl ist 3");
                break;
            case 4:
                System.out.println("deine Zahl ist 4");
                break;
            case 5:
                System.out.println("deine Zahl ist 5");
                break;
            case 6:
                System.out.println("deine Zahl ist 6");
                break;
            case 7:
                System.out.println("deine Zahl ist 7");
                break;
            case 8:
                System.out.println("deine Zahl ist 8");
                break;
            case 9:
                System.out.println("deine Zahl ist 9");
                break;
            case 10:
                System.out.println("deine Zahl ist 10");
                break;


        }
    }
}
