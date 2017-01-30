package io.zipcoder.pets;

/**
 * Created by anthonypajerowski on 1/30/17.
 */
public abstract class Pet {
    protected String name;
    public Pet() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     public String toString() {
         return null;
       }

    abstract public String speak();

}


//    Create a Pet class, and a subclass for each type of pet that you want your program to support.
//    Your classes should follow the following requirements:
//
//        You must support at least three types of pets.
//        Dog must be one of the types you support.
//        Cat must be one of the types you support.
//        The Pet class must have a speak method that each subclass overrides.
//        The Pet class must have a name field with setters and getters.
//        Use the tests provided as examples to write your own tests for other supported types of pets.