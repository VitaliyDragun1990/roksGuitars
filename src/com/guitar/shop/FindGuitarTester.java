package com.guitar.shop;

import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 7);
        List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for (Guitar guitar : matchingGuitars) {
                System.out.println("  We have a " +
                        guitar.getSpec().getBuilder() + " " + guitar.getSpec().getModel() + " " +
                        guitar.getSpec().getType() + " guitar:\n     " +
                        guitar.getSpec().getBackWood() + " back and sides,\n     " +
                        guitar.getSpec().getTopWood() + " top.\n  You can have it for only $" +
                        guitar.getPrice() + "!\n  ----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("11277", 3999.95,
                Builder.COLLINGS,
                "CJ", Type.ACOUSTIC,
                Wood.INDIAN_ROSEWOOD, Wood.SITKA, 7);
        inventory.addGuitar("V95693", 1499.95,
                Builder.FENDER,
                "Stratocastor", Type.ELECTRIC,
                Wood.ALDER, Wood.ALDER, 7);
        inventory.addGuitar("V9512", 1549.95,
                Builder.FENDER,
                "Stratocastor", Type.ELECTRIC,
                Wood.ALDER, Wood.ALDER, 7);
        inventory.addGuitar("122784", 5495.95,
                Builder.MARTIN,
                "D-18", Type.ACOUSTIC,
                Wood.MAHOGANY, Wood.ADIRONDACK, 7);
        inventory.addGuitar("76531", 6295.95,
                Builder.MARTIN,
                "OM-28", Type.ACOUSTIC,
                Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK, 7);
        inventory.addGuitar("70108276", 2295.95,
                Builder.GIBSON,
                "Les Paul", Type.ELECTRIC,
                Wood.MAHOGANY, Wood.MAHOGANY, 7);
        inventory.addGuitar("82765501", 1890.95,
                Builder.GIBSON,
                "SG '61 Reissue", Type.ELECTRIC,
                Wood.MAHOGANY, Wood.MAHOGANY, 7);
        inventory.addGuitar("77023", 6275.95,
                Builder.MARTIN,
                "D-28", Type.ACOUSTIC,
                Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK, 7);
        inventory.addGuitar("1092", 12995.95,
                Builder.OLSON,
                "SJ", Type.ACOUSTIC,
                Wood.INDIAN_ROSEWOOD, Wood.CEDAR, 7);
        inventory.addGuitar("566-62", 8999.95,
                Builder.RYAN,
                "Cathedral", Type.ACOUSTIC,
                Wood.COCOBOLO, Wood.CEDAR, 7);
        inventory.addGuitar("6 29584", 2100.95,
                Builder.PRS,
                "Dave Navarro Signature", Type.ELECTRIC,
                Wood.MAHOGANY, Wood.MAPLE, 7);
    }
}