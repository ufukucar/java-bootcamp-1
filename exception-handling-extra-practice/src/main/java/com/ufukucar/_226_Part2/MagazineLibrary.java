package com.ufukucar._226_Part2;

import java.util.ArrayList;

public class MagazineLibrary {
    private ArrayList<Magazine> magazines;

    public MagazineLibrary() {
        this.magazines = new ArrayList<>();
    }

    public Magazine getMagazine(int index) {
        Magazine mCopy = new Magazine(this.magazines.get(index));
        return mCopy;
    }

    public void setMagazine(Magazine magazine, int index) {
        Magazine mCopy = new Magazine(magazine);
        magazines.set(index, mCopy);
    }

    public void addMagazine(Magazine magazine) {
        Magazine mCopy = new Magazine(magazine);
        magazines.add(mCopy);
    }


}


