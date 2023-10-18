package at.ada.basis;

import java.util.Random;

public class ControlStructurs3 {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 0 und 100
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        // Gib die Zufallszahl aus
        System.out.println(randomNumber);
        // Wenn die Zahl kleiner ist als 20  gib aus "Mini"
        if (randomNumber<20){
            System.out.println("deine Zahl ist MINI!");
        }
        else if (randomNumber>50){
            System.out.println("deine Zahl ist LARGE!");
        }
        else {
            System.out.println("deine Zahl ist MEDIUM!");
        }
        // Wenn die Zahl zw. 20 und 50 ist gib aus "Medium"
        // Wenn die Zahl größer als 50 ist gib aus "Large"


    }
}

