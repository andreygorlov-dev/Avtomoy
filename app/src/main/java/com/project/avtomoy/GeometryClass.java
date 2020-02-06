package com.project.avtomoy;

import java.util.ArrayList;

public class GeometryClass {
    private String type;
    private ArrayList<Float> coordinates;

    public GeometryClass(String type, ArrayList<Float> coordinates) {
        this.type = type;
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Float> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ArrayList<Float> coordinates) {
        this.coordinates = coordinates;
    }
}
