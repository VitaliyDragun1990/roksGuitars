package com.guitar.shop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List<Guitar> guitars;

    public Inventory() {
        this.guitars = new ArrayList<>();
    }

    public void addGuitar(String serialNumber, double price,
                          Builder builder, String model, Type type,
                          Wood backWood, Wood topWood, int numStrings) {
        Guitar guitar = new Guitar(serialNumber, price,new GuitarSpec(builder, model, type,
                backWood, topWood, numStrings));
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        return guitars.stream().filter((guitar) -> guitar.getSerialNumber().equals(serialNumber))
                .findFirst().orElse(null);
    }

    public List<Guitar> search(GuitarSpec searchGuitarSpec) {
        List<Guitar> matchingGuitars = new LinkedList<>();
        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = i.next();

            if (guitar.getSpec().equals(searchGuitarSpec)) {
                matchingGuitars.add(guitar);
            }
        }
        return matchingGuitars;
    }
}
