package com.tp_poo_apis.tp3;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Properties;

public class Feature{
    @JsonProperty("type")
    public String getType() {
        return this.type; }
    public void setType(String type) {
        this.type = type; }
    String type;
    @JsonProperty("geometry")
    public Geometry getGeometry() {
        return this.geometry; }
    public void setGeometry(Geometry geometry) {
        this.geometry = geometry; }
    Geometry geometry;
    @JsonProperty("properties")
    public Properties getProperties() {
        return this.properties; }
    public void setProperties(Properties properties) {
        this.properties = properties; }
    Properties properties;
}
