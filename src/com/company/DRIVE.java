package com.company;

public class DRIVE{

    String nameDrive;
    int volumeDrive;
    String typeDrive;

    public DRIVE(String nameDrive, int volumeDrive, String typeDrive) {
        this.nameDrive = nameDrive;
        this.volumeDrive = volumeDrive;
        this.typeDrive = typeDrive;
    }

    void getInfoHdd (){
        System.out.println("Hdd name - " + nameDrive + "\nVolume - " + volumeDrive + "\nType - " + typeDrive);
    }

}
