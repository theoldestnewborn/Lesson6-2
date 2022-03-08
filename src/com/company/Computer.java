package com.company;

public class Computer {
    int price;
    String model;
    int hdd;
    int ram;
    RAM ram1;
    DRIVE hdd1;


    public Computer(int price, String model) {
        this.price = price;
        this.model = model;
        ram1 = new RAM("MegaRam", 1024);
        hdd1 = new DRIVE("MegaDRIVE", 160, "SSD");
    }

    public Computer(int price, String model, int ram, int hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }
    void getInfo () {
        System.out.println("Price - " + price + "\nModel - " + model + "\nRAM - " + ram + "\nHDD - " + hdd);
    }




}
