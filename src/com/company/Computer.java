package com.company;

public class Computer {
    int price;
    String model;
    int ram, drive;
    RAM ram1;
    DRIVE drive1;


    public Computer(int price, String model) {
        this.price = price;
        this.model = model;
        ram1 = new RAM("MegaRam", 1024);
        drive1 = new DRIVE("MegaDRIVE", 160, "SSD");

    }

    void getInfoComputer1 () {
        System.out.println("Price - " + price + "\nModel - " + model);
        ram1.getInfoRam();
        drive1.getInfoDrive();
    }

    public Computer(int price, String model, int ram, int drive) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.drive = drive;
    }
    void getInfoComputer2 () {
        System.out.println("\nPrice - " + price + "\nModel - " + model + "\nRAM - " + ram + "\nHDD - " + drive);
    }




}
