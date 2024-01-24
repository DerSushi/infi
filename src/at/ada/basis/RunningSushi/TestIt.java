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

        Sushi sushi2 = new Sushi(5, "Thunfisch", 8, 8);
        System.out.println(band.getInfoBand());

        ArrayList<Sushi> aSushiList = new ArrayList<>();
        String[] aArt = {"Lachs", "Gurke", "Avocado", "California Roll", "Thunfisch", "Lachs-Gurke", "Lachs-Avocado"};
        for (var i = 1; i <= 100; i++) {
            //max = 11 min = 0
            int lh = r.nextInt(11 + 1 - 0) + 0;
            //max = 15 min = 3
            int ra = r.nextInt(15 + 1 - 3) + 3;
            //dont forget array zugriff mit array start bei 0!!!!
            int ar = r.nextInt(aArt.length);
            int hoehe = r.nextInt(20 + 1 - 2) + 2;
            aSushiList.add(new Sushi(lh, aArt[ar], ra, hoehe));

        }
        for (Sushi a : aSushiList) {

            System.out.println(a.getInfoSushi());
            band.addSushiBand(a);
            System.out.println(band.getiSushiAufBand() + " stell - frei " + band.getFreiePlaetze());

        }
        System.out.println("Alle Sushi sind gemeinsam " + band.getGesamtSushiGewichtUebereinander() + " Gramm schwer");
        band.getSushiArt("Lachs");
        band.getSushiLeckerheit(5, 10);
        band.loescheSushiArt("Gurke");
        band.getSushiArt("Gurke");
    }
}