package com.company;

public class RAM {
    String nameRam;
    int memoryVolume;

    public RAM (String nameRam, int memoryVolume) {
        this.memoryVolume = memoryVolume;
        this.nameRam = nameRam;
    }

    void getInfoRam() {
        System.out.println("RAM name - " + nameRam + "\nRAM volume - " + memoryVolume);
    }
}
