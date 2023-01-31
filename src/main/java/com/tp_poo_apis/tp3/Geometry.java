package com.tp_poo_apis.tp3;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
public class Geometry{
    @JsonProperty("type")
    public String getType() {
        return this.type; }
    public void setType(String type) {
        this.type = type; }
    String type;
    @JsonProperty("coordinates")
    public ArrayList<Double> getCoordinates() {
        return this.coordinates; }
    public void setCoordinates(ArrayList<Double> coordinates) {
        this.coordinates = coordinates; }
    ArrayList<Double> coordinates;
}