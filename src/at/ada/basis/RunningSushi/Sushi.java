package at.ada.basis.RunningSushi;

public class Sushi {
    private int iLeckerheit;
    private String sArt;
    private int iRadius;
    private int iHoehe;

    public Sushi(int iLeckerheit, String sArt, int iRadius, int iHoehe) {
        this.iLeckerheit = iLeckerheit;
        this.sArt = sArt;
        this.iRadius = iRadius;
        this.iHoehe = iHoehe;
    }

    public Sushi() {
        this.iLeckerheit = 10;
        this.sArt = "KA";
        this.iRadius = 44;
    }

    public int getiHoehe() {
        return iHoehe;
    }

    public void setiHoehe(int iHoehe) {
        this.iHoehe = iHoehe;
    }

    public int getiLeckerheit() {
        return iLeckerheit;
    }

    public void setiLeckerheit(int iLeckerheit) {
        this.iLeckerheit = iLeckerheit;
    }

    public String getsArt() {
        return sArt;
    }

    public int getiRadius() {
        return iRadius;
    }

    public void setiRadius(int iRadius) {
        this.iRadius = iRadius;
    }

    public void setsArt(String sArt) {
        this.sArt = sArt;
    }

    public String getInfoSushi() {
        return "Sushi Art ist " + this.getsArt() +
                " Auf na Skala von 1-10 ist die Sushi echt ne " + this.getiLeckerheit() +
                " Sushi Radius ist " + this.getiRadius();
    }
}
