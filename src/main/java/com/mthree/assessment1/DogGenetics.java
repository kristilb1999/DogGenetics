package com.mthree.assessment1;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    public static void backgroundReport() {

        String[] dogBreeds = {"Golden Lab", "St. Bernard", "King Doberman", "German Shepherd", "Siberian Husky"};

        Random rand = new Random();

        int percentLeftToFind = 100;
        int breedChoice = 0;
        int percentBreed;

        for(int i = 0; percentLeftToFind > 0 && i < dogBreeds.length - 1; i++) {
            percentBreed = rand.nextInt(percentLeftToFind) + 1;
            System.out.println(percentBreed + "% " + dogBreeds[i]);
            percentLeftToFind -= percentBreed;
        }

        System.out.println(percentLeftToFind + "% " + dogBreeds[dogBreeds.length - 1]);


    }

    public static void main(String[] args) {

        String dogName;

        Scanner in = new Scanner(System.in);

        System.out.print("What is your dog's name? ");
        dogName = in.nextLine();

        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        System.out.println();

        System.out.println(dogName + " is: \n");

        backgroundReport();

        System.out.println();
        System.out.println("Wow! That's QUITE the dog.");

    }

}
