package com.tts;
import com.tts.country.Country;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Country myCountry = new Country("Turkey", "Ankara", "Lira");
        System.out.println("The country is " + myCountry.getName() + " and the capital is " + myCountry.getCapital() + " and their currency is " + myCountry.getCurrency());
    }
}
