package com.guitar.shop;

public enum Builder {

    FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;

    public String toString() {
        switch (this) {
            case FENDER: return "Fender";
            case MARTIN: return "Martin";
            case GIBSON: return "GIBSON";
            case COLLINGS: return "Collings";
            case OLSON: return "OLSON";
            case RYAN: return "RYAN";
            case PRS: return "PRS";
            default: return "Unspecified";
        }
    }
}
