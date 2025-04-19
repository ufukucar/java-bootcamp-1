package com.ufukucar._274_Part2.model;

public class Microscope extends LabEquipment {


    private int magnification;
    public static final int MIN_SPEC = 1;

    public Microscope(String manufacturer, String model, int year, int magnification) {
        super(manufacturer, model, year);
        setMagnification(magnification);
    }

    public Microscope (Microscope source) {
        super(source);
        setMagnification(source.magnification);
    }

    public LabEquipment clone() {
        return new Microscope(this);
    }

    public int getMagnification() {
        return magnification;
    }

    public void setMagnification(int magnification) {
        if (magnification < MIN_SPEC ) throw new IllegalArgumentException("Magnification must be greater than or equal to the minimum maginification.");
        this.magnification = magnification;
    }

    @Override
    public String performMaintenance() {
        return "Microscope maintenance: Clean the lenses and check the light source";
    }


}
