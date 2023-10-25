package at.ada.basis;

import java.util.Random;
import java.util.Scanner;
public class BankomatBeispiel {
    public static void main(String[] args) {
        float Bankgeldf = 0;
        float Eingabef = 0;
        for(int i=1; i>0; i++){
        Scanner scanner = new Scanner(System.in);

                    System.out.println("Wählen Sie einen Befehl aus:");
                    System.out.println("1. (e) für Geld einzahlen");
                    System.out.println("2. (a) für Geld abheben");
                    System.out.println("3. (k) für Kontostand prüfen");
                    System.out.println("4. (b) für Interaktion beenden");
                    char AuswahlC = scanner.next().charAt(0);
                    switch(AuswahlC){
                case 'e':
                    System.out.println("Wie viel Geld wollen sie einzahlen?");
                    Eingabef = scanner.nextFloat();
                    if (Eingabef > 0) {
                        Bankgeldf += Eingabef;
                        System.out.println("Einzahlung von " + Eingabef + " Euro erfolgreich. Neuer Kontostand: " + Bankgeldf + " Euro");
                    }
                    else {
                        System.out.println("Ungültiger Einzahlungsbetrag. Bitte geben Sie einen positiven Betrag ein.");
                    }
                    break;
                case 'a':
                    System.out.println("Wie viel Geld wollen sie abheben?");
                    Eingabef = scanner.nextFloat();
                    if (Eingabef > 0) {
                        Bankgeldf -= Eingabef;
                        System.out.println("Einzahlung von " + Eingabef + " Euro erfolgreich. Neuer Kontostand: " + Bankgeldf + " Euro");
                    }
                    else {
                        System.out.println("Sie können kein negatives Geld abheben!");
                    }
                    break;
                case 'k':
                    System.out.println("Ihr Konto beinhaltet: "+Bankgeldf+" Euro");
                    break;
                case 'b':
                    System.out.println("Vielen Dank, dass Sie heute mit uns interagiert haben.");
                    System.exit(0);
            }
        }
    }
}