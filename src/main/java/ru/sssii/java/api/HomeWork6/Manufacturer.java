package ru.sssii.java.api.HomeWork6;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Manufacturer extends Notebook{
    public void sortManufacturer(List<Notebook> ctlgCopy) {
        Collections.sort(ctlgCopy, new Comparator<Notebook>() {
            @Override
            public int compare(Notebook o1, Notebook o2) {
                return o1.getManufacturer().compareTo(o2.getManufacturer());
            }
        });
    }
}
