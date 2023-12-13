package at.ada.basis.Auto.mp.oop.auto;

public class Auto {
    private int iLeistung;
    private String sFarbe;
    private int iAnzahlRaeder;

    public Auto(int iLeistung, String sFarbe, int iAnzahlRaeder){
        this.iLeistung = iLeistung;
        this.sFarbe = sFarbe;
        this.iAnzahlRaeder = iAnzahlRaeder;
    }

    public Auto() {
        this.iLeistung = 3322;
        this.sFarbe = "KA";
        this.iAnzahlRaeder = 44;
    }

    public int getiLeistung() {
        return iLeistung;
    }

    public void setiLeistung(int iLeistung) {
        this.iLeistung = iLeistung;
    }

    public String getsFarbe() {
        return sFarbe;
    }

    public int getiAnzahlRaeder() {
        return iAnzahlRaeder;
    }

    public void setiAnzahlRaeder(int iAnzahlRaeder) {
        this.iAnzahlRaeder = iAnzahlRaeder;
    }

    public void setsFarbe(String sFarbe) {
        this.sFarbe = sFarbe;
    }

    public String getInfoAuto(){
                return "Auto Farbe ist "+this.getsFarbe()+
                        " Auto Leistung ist "+this.getiLeistung()+
                        " Auto Anzahl Räder ist "+this.getiAnzahlRaeder();
    }
}
