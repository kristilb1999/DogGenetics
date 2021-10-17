package com.mthree.assessment1;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    public static void backgroundReport() {

        Random rand = new Random();

        int breed0 = 0;
        int breed1 = 0;
        int breed2 = 0;
        int breed3 = 0;
        int breed4 = 0;

        int percentBreed = 0;

        //randomly generate percentages for the breed until you find a combination that
        //equals exactly 100
        while(percentBreed != 100) {

            breed0 = rand.nextInt(100);
            breed1 = rand.nextInt(100);
            breed2 = rand.nextInt(100);
            breed3 = rand.nextInt(100);
            breed4 = rand.nextInt(100);

            percentBreed = breed0 + breed1 + breed2 + breed3 + breed4;

        }

        //the breeds are not random, but could be random if added to an array and chosen randomly
        System.out.println(breed0 + "% Golden Lab");
        System.out.println(breed1 + "% Doberman");
        System.out.println(breed2 + "% Chihuahua");
        System.out.println(breed3 + "% German Shepherd");
        System.out.println(breed4 + "% St. Bernard");


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
