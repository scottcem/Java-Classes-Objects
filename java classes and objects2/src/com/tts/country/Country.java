package com.tts.country;

public class Country {
    private String name;
    private String capital;
    private String currency;

    public Country(){

    }

    public Country(String name, String capital, String currency){
        this.name = name;
        this.capital = capital;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
