package at.ada.basis.RunningSushi;

public class Band {
        private int iSushiPlaetze;
        private String sAdresse;
        private int iGewichtmax;
        private double iKalorien;
        private int iFreiePlaetze;
        ArrayList<Sushi> SushiListe;

        public Band(int iSushiPlaetze, String sAdresse, int iGewichtmax, double iKalorien) {
            this.iSushiPlaetze = iSushiPlaetze;
            this.sAdresse = sAdresse;
            this.iGewichtmax = iGewichtmax;
            this.iKalorien = iKalorien;
            this.SushiListe = new ArrayList<Sushi>();
        }

        public int getiSushiPlaetze() {
            return iSushiPlaetze;
        }

        public void setiSushiPlaetze(int iSushiPlaetze) {
            this.iSushiPlaetze = iSushiPlaetze;
        }

        public String getsAdresse() {
            return sAdresse;
        }

        public void setsAdresse(String sAdresse) {
            this.sAdresse = sAdresse;
        }

        public int getiGewichtmax() {
            return iGewichtmax;
        }

        public void setiGewichtmax(int iGewichtmax) {
            this.iGewichtmax = iGewichtmax;
        }

        public double getiKalorien() {
            return iKalorien;
        }

        public void setiKalorien(double iKalorien) {
            this.iKalorien = iKalorien;
        }

        public int getiSushiInGarage() {
            return this.SushiListe.size();
        }

        public int getFreiePlaetze() {
            return this.iSushiPlaetze - getiSushiInGarage();
        }

        public void getSushiLeckerheit(Integer leckerheitMin, Integer leckerheitMax) {
            int ch = 0;
            if (leckerheitMin > leckerheitMax) {
                int cu = leckerheitMax;
                leckerheitMin = leckerheitMax;
                leckerheitMax = cu;
            }
            System.out.println("Folgende Sushi mit Leckerheit " + leckerheitMin + " bis " + leckerheitMax + " sind in der Liste:");
            for (Sushi s : SushiListe) {
                if (s.getiLeckerheit() > leckerheitMin && s.getiLeckerheit() < leckerheitMax) {
                    System.out.println(s.getInfoSushi());
                }
            }
        }

        public void addSushiToGarage(Sushi sushi) {
            if (sushi.getiHoehe() > this.getiGewichtmax())
                System.out.println("Das Sushi ist zu schwer!");
            else if (this.getFreiePlaetze() > 0) {
                this.SushiListe.add(sushi);
            } else {
                System.out.println("Garage voll!");
            }
        }

        public void getSushiArt(String art) {
            System.out.println("Folgende Sushi mit Art " + art + " sind in der Liste:");
            for (Sushi s : SushiListe) {
                if (s.getsArt().equals(art)) {
                    System.out.println(s.getInfoSushi());
                }
            }
        }

        public int getGesamtSushiGewichtUebereinander() {
            int wert = 0;
            for (Sushi s : SushiListe) {
                wert += s.getiHoehe();
            }
            return wert;
        }

        public void loescheSushiArt(String art) {
            int counter = 0;
            // aus der Liste entfernen
            for (int i = SushiListe.size() - 1; i >= 0; i--) {
                if (SushiListe.get(i).getsArt().equals(art)) {
                    SushiListe.remove(i);
                    counter++;
                }
            }
        }
    }
