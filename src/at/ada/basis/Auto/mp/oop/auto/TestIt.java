package at.ada.basis.Auto.mp.oop.auto;

import java.util.ArrayList;
import java.util.Random;

public class TestIt
{
    public static void main(String[] args) {
        Random r = new Random();
        Auto auto = new Auto();

        Garage garage = new Garage(100,"Bei Giesinger dahoam",200,10.00);

        System.out.println(auto.getInfoAuto());
        auto.setiLeistung(360);
        auto.setsFarbe("blau");
        auto.setiAnzahlRaeder(5);
        System.out.println(auto.getInfoAuto());

        Auto auto2 = new Auto(330,"blau",8, 180);
        System.out.println(auto.getInfoAuto());

        ArrayList<Auto> aAutoList = new ArrayList<>();
        String[] aFarben = {"rot","rot","gemischt","pink","tuerkis","gruen","Giesingers Hautfarbe"};
        for(var i=1;i<=100;i++){
            //max = 500 min = 50
            int ps = r.nextInt(500+1-50)+50;
            //max = 4 min = 3
            int ra = r.nextInt(4+1-3)+3;
            //dont forget array zugriff mit array start bei fucking 0!!!!
            int fa = r.nextInt(aFarben.length);
            int hoehe = r.nextInt(200+1-110)+110;
            aAutoList.add(new Auto(ps,aFarben[fa],ra,hoehe));

        }
        for(Auto a : aAutoList){

                System.out.println(a.getInfoAuto());
                garage.addAutoGarage(a);
                System.out.println(garage.getiParkplätze() + " stell - frei " + garage.getFreiePlaetze());

        }
        System.out.println("Alle Autos sing gemeinsam "+garage.getGesamtFahrzeughöeheUebereinander()+" hoch");
        garage.getAutoFarbe("Giesingers Hautfarbe");
        garage.getAutoLeistung(20,200);
        garage.loescheAutosFarbe("rot");
        garage.getAutoFarbe("rot");
    }
}
