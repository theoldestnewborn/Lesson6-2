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

    void getInfoDrive (){
        System.out.println("Drive name - " + nameDrive + "\nVolume - " + volumeDrive + "\nType - " + typeDrive);
    }

}
