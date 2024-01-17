package at.ada.basis.Auto.mp.oop.auto;

import java.util.ArrayList;

public class Garage {
    private int iParkplätze;
    private String sAdresse;
    private int iHoehe;
    private double dPreis;
    private int iFreiePlaetze;
    ArrayList<Auto> autoListe;

    public Garage(int iParkplätze, String sAdresse, int iHoehe, double iPreis) {
        this.iParkplätze = iParkplätze;
        this.sAdresse = sAdresse;
        this.iHoehe = iHoehe;
        this.dPreis = dPreis;
        this.autoListe = new ArrayList<Auto>();
    }

    public int getiParkplätze() {
        return iParkplätze;
    }

    public void setiParkplätze(int iParkplätze) {
        this.iParkplätze = iParkplätze;
    }

    public String getsAdresse() {
        return sAdresse;
    }

    public void setsAdresse(String sAdresse) {
        this.sAdresse = sAdresse;
    }

    public int getiHoehe() {
        return iHoehe;
    }

    public void setiHoehe(int iHoehe) {
        this.iHoehe = iHoehe;
    }

    public double getdPreis() {
        return dPreis;
    }

    public void setdPreis(double dPreis) {
        this.dPreis = dPreis;
    }

    public int getiAutosInGarage() {
        return this.autoListe.size();
    }

    public int getFreiePlaetze() {
        return this.iParkplätze - getiAutosInGarage();
    }

    public void getAutoLeistung(Integer leistungmin, Integer leistungmax) {
        int ch=0;
        if(leistungmin>leistungmax){
            int cu=leistungmax;
            leistungmin=leistungmax;
            leistungmax=cu;
        }
        System.out.println("Folgende Auto mit Leistung "+leistungmin+" bis "+leistungmax+" sind in der Liste:");
        for (Auto a : autoListe) {
            if (a.getiLeistung()>leistungmin && a.getiLeistung()<leistungmax) {
                System.out.println(a.getInfoAuto());
            }
        }
    }

    public void addAutoGarage(Auto auto) {
        if (auto.getFahrzeughoehe() > this.getiHoehe())
            System.out.println("Das Auto ist zu hoch!");
        else if (this.getFreiePlaetze() > 0) {
            this.autoListe.add(auto);
        } else {
            System.out.println("Garage voll!");
        }
    }
    public void getAutoFarbe(String farbe) {
        System.out.println("Folgende Auto mit Farbe "+farbe+" sind in der Liste:");
        for (Auto a : autoListe) {
            if (a.getsFarbe().equals(farbe)) {
                System.out.println(a.getInfoAuto());
            }
        }
    }
    public int getGesamtFahrzeughöeheUebereinander() {
        int wert = 0;
        for (Auto a : autoListe) {
            wert += a.getFahrzeughoehe();
        }
        return wert;
    }


    public void loescheAutosFarbe(String farbe) {
        int counter=0;
        //aus der Liste entfernen
        for (int i=autoListe.size()-1;i>=0;i--){
            if (autoListe.get(i).getsFarbe().equals(farbe)) {
                autoListe.remove(i);
                counter++;
            }
        }
    }
    }