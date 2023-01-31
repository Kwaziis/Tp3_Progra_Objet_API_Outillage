package com.tp_poo_apis.tp3;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Date;

public class Forecast{
    @JsonProperty("insee")
    public String getInsee() {
        return this.insee; }
    public void setInsee(String insee) {
        this.insee = insee; }
    String insee;
    @JsonProperty("cp")
    public int getCp() {
        return this.cp; }
    public void setCp(int cp) {
        this.cp = cp; }
    int cp;
    @JsonProperty("latitude")
    public double getLatitude() {
        return this.latitude; }
    public void setLatitude(double latitude) {
        this.latitude = latitude; }
    double latitude;
    @JsonProperty("longitude")
    public double getLongitude() {
        return this.longitude; }
    public void setLongitude(double longitude) {
        this.longitude = longitude; }
    double longitude;
    @JsonProperty("day")
    public int getDay() {
        return this.day; }
    public void setDay(int day) {
        this.day = day; }
    int day;
    @JsonProperty("datetime")
    public Date getDatetime() {
        return this.datetime; }
    public void setDatetime(Date datetime) {
        this.datetime = datetime; }
    Date datetime;
    @JsonProperty("wind10m")
    public int getWind10m() {
        return this.wind10m; }
    public void setWind10m(int wind10m) {
        this.wind10m = wind10m; }
    int wind10m;
    @JsonProperty("gust10m")
    public int getGust10m() {
        return this.gust10m; }
    public void setGust10m(int gust10m) {
        this.gust10m = gust10m; }
    int gust10m;
    @JsonProperty("dirwind10m")
    public int getDirwind10m() {
        return this.dirwind10m; }
    public void setDirwind10m(int dirwind10m) {
        this.dirwind10m = dirwind10m; }
    int dirwind10m;
    @JsonProperty("rr10")
    public double getRr10() {
        return this.rr10; }
    public void setRr10(double rr10) {
        this.rr10 = rr10; }
    double rr10;
    @JsonProperty("rr1")
    public double getRr1() {
        return this.rr1; }
    public void setRr1(double rr1) {
        this.rr1 = rr1; }
    double rr1;
    @JsonProperty("probarain")
    public int getProbarain() {
        return this.probarain; }
    public void setProbarain(int probarain) {
        this.probarain = probarain; }
    int probarain;
    @JsonProperty("weather")
    public int getWeather() {
        return this.weather; }
    public void setWeather(int weather) {
        this.weather = weather; }
    int weather;
    @JsonProperty("tmin")
    public int getTmin() {
        return this.tmin; }
    public void setTmin(int tmin) {
        this.tmin = tmin; }
    int tmin;
    @JsonProperty("tmax")
    public int getTmax() {
        return this.tmax; }
    public void setTmax(int tmax) {
        this.tmax = tmax; }
    int tmax;
    @JsonProperty("sun_hours")
    public int getSun_hours() {
        return this.sun_hours; }
    public void setSun_hours(int sun_hours) {
        this.sun_hours = sun_hours; }
    int sun_hours;
    @JsonProperty("etp")
    public int getEtp() {
        return this.etp; }
    public void setEtp(int etp) {
        this.etp = etp; }
    int etp;
    @JsonProperty("probafrost")
    public int getProbafrost() {
        return this.probafrost; }
    public void setProbafrost(int probafrost) {
        this.probafrost = probafrost; }
    int probafrost;
    @JsonProperty("probafog")
    public int getProbafog() {
        return this.probafog; }
    public void setProbafog(int probafog) {
        this.probafog = probafog; }
    int probafog;
    @JsonProperty("probawind70")
    public int getProbawind70() {
        return this.probawind70; }
    public void setProbawind70(int probawind70) {
        this.probawind70 = probawind70; }
    int probawind70;
    @JsonProperty("probawind100")
    public int getProbawind100() {
        return this.probawind100; }
    public void setProbawind100(int probawind100) {
        this.probawind100 = probawind100; }
    int probawind100;
    @JsonProperty("gustx")
    public int getGustx() {
        return this.gustx; }
    public void setGustx(int gustx) {
        this.gustx = gustx; }
    int gustx;
}