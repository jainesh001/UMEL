package AbstractP.Animal;

public class Horse extends Mammal {

    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void makeNoise() {
        System.out.println(getExplicitType() + "sheds in the spring");
    }

    @Override
    public void shedHair() {

    }

}
