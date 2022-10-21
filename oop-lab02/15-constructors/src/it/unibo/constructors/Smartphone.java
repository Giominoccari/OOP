package it.unibo.constructors;

import javax.swing.text.html.HTMLDocument.BlockElement;

class Smartphone {

    static final boolean DEF_HAS_GPS = true;
    static final boolean DEF_HAS_3G = true;
    static final boolean DEF_HAS_NFC = true;
    static final int DEF_SD_SIZE = 8192;
    static final int DEF_RAM_SIZE = 1024;
    static final int DEF_N_CPU = 2;

    int nCPU;
    int ram;
    int sdSize;
    String brand;
    String model;
    boolean hasGPS;
    boolean has3G;
    boolean hasNFC;
        Smartphone(String brand, String model, boolean hasGPS, boolean has3G, boolean hasNFC, int sdSize, int ram, int nCPU){
            this.brand = brand;
            this.model = model;
            this.has3G = has3G;
            this.hasGPS = hasGPS;
            this.hasNFC = hasNFC;
            this.sdSize = sdSize;
            this.ram = ram;
            this.nCPU = nCPU;
        }
        Smartphone(String brand, String model, boolean gps, boolean gig){
            this(brand, model, gps, gig, false, 0, 0, 0);
        }
        Smartphone(String brand, String model, int sdSize){
            this(brand, model, false, false, false, sdSize, 0, 0);
        }
        Smartphone(String brand, String model, boolean hasNFC){
            this(brand, model, false, false, hasNFC, 0, 0, 0);
        }
        Smartphone(String brand, String model){
            this(brand, model, false, false, false, 0, 0, 0);
        }

    void printStringRep() {
        System.out.println("Smartphone info:");
        System.out.println("n CPU(s): " + this.nCPU);
        System.out.println("RAM amount: " + this.ram);
        System.out.println("SD size: " + this.sdSize);
        System.out.println("brand: " + this.brand);
        System.out.println("model: " + this.model);
        System.out.println("hasGPS: " + this.hasGPS);
        System.out.println("has3G: " + this.has3G);
        System.out.println("hasNFC: " + this.hasNFC + "\n");
    }

    public static void main(final String[] args) {
        // 1) Creare lo smarthpone HTC One sdSize:1024

        // 2) Creare lo smarthpone Samsung Galaxy Note 3 ram:2048 cpu:4
        // sdSize:8192 gps:true nfc:true 3g:true

        // 3) Creare lo smarthpone Apple iPhone 5S nfc:false

        // 4) Creare lo smarthpone Google Nexus 4 gps:true 3g:true

        // 5) Utilizzare il metodo printStringRep per stampare in standard
        // output le informazioni di ciascun telefono
        Smartphone htc = new Smartphone("HTC", "One", 1024);
        htc.printStringRep();
        Smartphone sam = new Smartphone("Samsung", "Galaxy Note 3", true, true, true, 8192, 2048, 4);
        sam.printStringRep();
        Smartphone app = new Smartphone("Apple", "iPhone 5s", false);
        app.printStringRep();
        Smartphone ggl = new Smartphone("Google", "Nexus 4", true, true);
        ggl.printStringRep();
    }
}
