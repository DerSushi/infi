package at.ada.basis;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ArrayBeispiel {

    private static final char SPIELER_X = 'X';
    private static final char SPIELER_O = 'O';

    private static boolean spielAktiv = true;
    private static char aktuellerSpieler = SPIELER_X;
    private static char[][] spielbrett = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    private static void anzeigen() {
        for (char[] row : spielbrett) {
            for (char cell : row) {
                System.out.print(cell + " | ");
            }
            System.out.println();
            System.out.println("---------");
        }
    }

    private static void handleCellClick(int row, int col) {
        if (!spielAktiv) return;

        if (spielbrett[row][col] == ' ') {
            spielbrett[row][col] = aktuellerSpieler;
            anzeigen();

            if (hatGewonnen()) {
                System.out.println("Spieler " + aktuellerSpieler + " hat gewonnen!");
                resetSpiel();
            } else if (istUnentschieden()) {
                System.out.println("Unentschieden!");
                resetSpiel();
            } else {
                aktuellerSpieler = (aktuellerSpieler == SPIELER_X) ? SPIELER_O : SPIELER_X;
            }
        }
    }

    private static boolean hatGewonnen() {
        for (int i = 0; i < 3; i++) {
            if ((spielbrett[i][0] == aktuellerSpieler && spielbrett[i][1] == aktuellerSpieler && spielbrett[i][2] == aktuellerSpieler) ||
                    (spielbrett[0][i] == aktuellerSpieler && spielbrett[1][i] == aktuellerSpieler && spielbrett[2][i] == aktuellerSpieler)) {
                spielAktiv = false;
                return true;
            }
        }

        if ((spielbrett[0][0] == aktuellerSpieler && spielbrett[1][1] == aktuellerSpieler && spielbrett[2][2] == aktuellerSpieler) ||
                (spielbrett[0][2] == aktuellerSpieler && spielbrett[1][1] == aktuellerSpieler && spielbrett[2][0] == aktuellerSpieler)) {
            spielAktiv = false;
            return true;
        }

        return false;
    }

    private static boolean istUnentschieden() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (spielbrett[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private static void resetSpiel() {
        spielbrett = new char[][]{
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        aktuellerSpieler = SPIELER_X;
        spielAktiv = true;
        System.out.println("Spiel zurückgesetzt.");
        anzeigen();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        anzeigen();
        while (spielAktiv) {
            System.out.println("Spieler " + aktuellerSpieler + ", wähle eine Zeile (1-3) und eine Spalte (1-3) getrennt durch Leerzeichen:");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;

            if (row >= 0 && row < 3 && col >= 0 && col < 3) {
                handleCellClick(row, col);
            } else {
                System.out.println("Ungültige Auswahl. Bitte wähle eine Zeile und eine Spalte zwischen 1 und 3.");
            }
        }
    }
}
