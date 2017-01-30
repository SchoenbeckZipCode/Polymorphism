package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by anthonypajerowski on 1/30/17.
 */

public class UserPetInformation {

    ArrayList<UserPetInformation> pets = new ArrayList<UserPetInformation>();

    UserPetInformation(){}

    UserPetInformation(String petName, String typeOfPet ) {
        this.petName = petName;
        this.typeOfPet = typeOfPet;
    }

    private int numberOfPets;
    private String petName;
    private String typeOfPet;

    public void setNumberOfPets(int numberOfPets){
        this.numberOfPets = numberOfPets;
    }

    public int getNumberOfPets(){
        return this.numberOfPets;
    }

    public void setTypeOfPet(String typeOfPet) {
        this.typeOfPet = typeOfPet;
    }

    public String getTypeOfPet() {
        return this.typeOfPet;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetName() {
        return this.petName;
    }

    public ArrayList<UserPetInformation> askAboutUsersPets() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        setNumberOfPets(sc.nextInt());
        int counter = 1;
        for ( int i = 0; i < getNumberOfPets(); i++ ) {
            System.out.println("What is the name of pet number " + counter + "?");
            setPetName( sc.next());
            System.out.println("What type of pet is pet :" + getPetName());
            setTypeOfPet(sc.next());
            pets.add(new UserPetInformation(getPetName(),getTypeOfPet()));
            counter++;
        }

        return pets;
    }

    public void listPets() {
        for (UserPetInformation pet : pets) {
            System.out.print(pet.getPetName() + " is a ");
            System.out.println(pet.getTypeOfPet());
        }
    }
}

//  Create a program that asks the user how many pets they have. Once you know how many pets
//  they have, ask them what kind of pet each one is, along with each pet's name.
//  For now your program should just hold onto the user input and print out the list at the end;
//  we'll modify this in part 3.