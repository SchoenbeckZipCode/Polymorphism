package pajerowski.tony;

/**
 * Created by anthonypajerowski on 2/1/17.
 */
public class Cat extends Pet {

    private String name;

    public String getName(){
        return name;
    }

    Cat(){}

    Cat(String name) {
        this.name = name;
    }

    public String speak() {
        return "ooh Meow!";
    }
}
