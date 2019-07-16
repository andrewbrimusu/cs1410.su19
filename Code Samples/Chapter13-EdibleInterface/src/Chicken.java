
public class Chicken extends Animal implements Edible {
    public Chicken(double weight) {
        super(weight);
    }

    @Override
    public String howToEat() {
        return "Chicken: Fry it";
    }

    @Override
    public String sound() {
        return "Chicken: cock-a-doodle-doo";
    }
}
