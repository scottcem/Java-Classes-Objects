package com.tts;
import com.tts.pet.Pets;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Pets scottsPet = new Pets("Champ", 2, "Black Curr", "Shreveport");
    //  Pets megsPet = new Pets("Sami", 5, "Maltese", "Shreveport");

    //  Pets johnsPet = new Pets();
      //    get user input
    //    johnsPet.setName("Puppy");

    //    System.out.println(johnsPet.getName());

        System.out.println("My pets name is " + scottsPet.getName() + " and my pets age is: " + scottsPet.getAge() + " He is a " + scottsPet.getType() + " and we live in " + scottsPet.getLocation());

    }
}
