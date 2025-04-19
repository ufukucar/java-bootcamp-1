package com.ufukucar._274_Part2.model;

import java.util.ArrayList;

public class Lab {

    private ArrayList<LabEquipment> labEquipments;

    public Lab() {
        this.labEquipments = new ArrayList<>();
    }

    // BURASI ÖNEMLİ. ABSTRACT SINIFTAN NEW YAPAMADIĞIMIZ İÇİN ABSTRACT CLONE METODU OLUŞTURDUK
    public LabEquipment getLabEquipment (int index) {
        return this.labEquipments.get(index).clone();
    }

    public void setLabEquipment (int index, LabEquipment labEquipment) {
        this.labEquipments.set(index, labEquipment.clone());
    }

    public void addLabEquipment (LabEquipment labEquipment) {
        this.labEquipments.add(labEquipment.clone());
    }

}
