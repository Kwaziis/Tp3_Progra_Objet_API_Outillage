package com.tp_poo_apis.tp3;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
    public class MeteoRoot{
        @JsonProperty("city")
        public City getCity() {
            return this.city; }
        public void setCity(City city) {
            this.city = city; }
        City city;
        @JsonProperty("update")
        public Date getUpdate() {
            return this.update; }
        public void setUpdate(Date update) {
            this.update = update; }
        Date update;
        @JsonProperty("forecast")
        public Forecast getForecast() {
            return this.forecast; }
        public void setForecast(Forecast forecast) {
            this.forecast = forecast; }
        Forecast forecast;
    }

