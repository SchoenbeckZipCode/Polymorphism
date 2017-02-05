package pajerowski.tony;

/**
 * Created by anthonypajerowski on 2/1/17.
 */
public class Dog extends Pet{

    private String name;

    public String getName() {
        return name;
    }

    Dog(){}

    Dog(String name){
        this.name = name;
    }

    public String speak() {
        return "bark bark bark bark bark!";
    }
}
