package it.unibo.constructors;

class UseConstructorsEvolved {

    public static void main(final String[] args) {
        // 1) Creare un treno con numero di posti di default, come nel caso
        // precedente (serve a verificare la nuova implementazione di Train()).

        // 2) Creare i seguenti treni usando il costruttore Train(int nFCSeats, int
        // nSCSeats)
        // - nFCSeats = 20; nSCSeats= 200;
        // - nFCSeats = 35; nSCSeats= 165;
        Train primo = new Train();
        primo.printTrainInfo();
        Train secondo = new Train(20, 200);
        secondo.printTrainInfo();
        Train terzo = new Train(35, 165);
        terzo.printTrainInfo();
    }
}
