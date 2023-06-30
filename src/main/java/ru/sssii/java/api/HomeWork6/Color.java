package ru.sssii.java.api.HomeWork6;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Color extends Notebook{
    public void sortColor(List<Notebook> ctlgCopy) {
        Collections.sort(ctlgCopy, new Comparator<Notebook>() {
            @Override
            public int compare(Notebook o1, Notebook o2) {
                return o1.getColor().compareTo(o2.getColor());
            }
        });
    }
}
