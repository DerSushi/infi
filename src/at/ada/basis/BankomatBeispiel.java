package at.ada.basis;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class BankomatBeispiel {
    public static void main(String[] args) {
        float Bankgeldf = 0;
        float eingabef = 0;
        String fNr = "";
        for (int i = 1; i > 0; i++) {
            Scanner scanner = new Scanner(System.in);
            try {
                Thread.sleep(2 * 1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Wählen Sie einen Befehl aus:");
            System.out.println("1. (e) für Geld einzahlen");
            System.out.println("2. (a) für Geld abheben");
            System.out.println("3. (k) für Kontostand prüfen");
            System.out.println("4. (b) für Interaktion beenden");
            char AuswahlC = scanner.next().charAt(0);
            switch (AuswahlC) {
                case 'e':
                    System.out.println("Wie viel Geld wollen sie einzahlen?");
                    fNr = scanner.next();
                    if (checkFloat(fNr)) {
                        eingabef = Float.parseFloat(fNr);
                    } else {
                        eingabef = 0;
                    }

                    if (eingabef > 0) {
                        Bankgeldf += eingabef;
                        System.out.println("Einzahlung von " + eingabef + " Euro erfolgreich. Neuer Kontostand: " + Bankgeldf + " Euro");
                    } else {
                        System.out.println("Ungültiger Einzahlungsbetrag. Bitte geben Sie einen positiven Betrag ein.");
                    }

                    break;
                case 'a':
                    System.out.println("Wie viel Geld wollen sie abheben?");
                    fNr = scanner.next();
                    if (checkFloat(fNr)) {
                        eingabef = Float.parseFloat(fNr);
                    } else {
                        eingabef = 0;
                    }
                    //eingabef = scanner.nextFloat();
                    if (eingabef > 0) {
                        Bankgeldf -= eingabef;
                        System.out.println("Einzahlung von " + eingabef + " Euro erfolgreich. Neuer Kontostand: " + Bankgeldf + " Euro");
                    } else {
                        System.out.println("Sie können kein negatives Geld abheben!");
                    }
                    break;
                case 'k':
                    System.out.println("Ihr Konto beinhaltet: " + Bankgeldf + " Euro");
                    break;
                case 'b':
                    System.out.println("Vielen Dank, dass Sie heute mit uns interagiert haben.");
                    System.exit(0);
            }
        }
    }

    public static Float getInput(String eingabetext, Scanner scanner) {
        Float eingabef =0.0F;
        String fNr = "";
        System.out.println(eingabetext);
        fNr = scanner.next();
        if (checkFloat(fNr)) {
            eingabef = Float.parseFloat(fNr);
        }
        return eingabef;
    }
    public static Boolean checkFloat(String s) {
        try{
            Float.parseFloat(s);
            return true;
        } catch (NumberFormatException error) {
            return false;
        }
    }
}