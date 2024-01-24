package at.ada.basis.RunningSushi;

import java.util.ArrayList;
import java.util.Random;

public class TestIt {
    public static void main(String[] args) {
        Random r = new Random();
        Sushi sushi = new Sushi();

        Band band = new Band(100,"Bei Gloria", 500,5000);

        System.out.println(sushi.getInfoSushi());
        sushi.setiLeckerheit(11);
        sushi.setsArt("Lachs");
        sushi.setiRadius(15);
        sushi.setiHoehe(15);
        System.out.println(sushi.getInfoSushi());

        Sushi sushi2 = new Sushi(330, "blau", 8, 180);
        System.out.println(auto.getInfoAuto());

        ArrayList<Sushi> aSushiList = new ArrayList<>();
        String[] aFarben = {"rot", "rot", "gemischt", "pink", "tuerkis", "gruen", "Giesingers Hautfarbe"};
        for (var i = 1; i <= 100; i++) {
            //max = 500 min = 50
            int ps = r.nextInt(500 + 1 - 50) + 50;
            //max = 4 min = 3
            int ra = r.nextInt(4 + 1 - 3) + 3;
            //dont forget array zugriff mit array start bei fucking 0!!!!
            int fa = r.nextInt(aFarben.length);
            int hoehe = r.nextInt(200 + 1 - 110) + 110;
            aAutoList.add(new Auto(ps, aFarben[fa], ra, hoehe));

        }
        for (Auto a : aAutoList) {

            System.out.println(a.getInfoAuto());
            garage.addAutoGarage(a);
            System.out.println(garage.getiParkplätze() + " stell - frei " + garage.getFreiePlaetze());

        }
        System.out.println("Alle Autos sing gemeinsam " + garage.getGesamtFahrzeughöeheUebereinander() + " hoch");
        garage.getAutoFarbe("Giesingers Hautfarbe");
        garage.getAutoLeistung(20, 200);
        garage.loescheAutosFarbe("rot");
        garage.getAutoFarbe("rot");
    }
}