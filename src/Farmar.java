import java.util.ArrayList;

public class Farmar extends Flower {
    private ArrayList<Flower> flowers;

    public Farmar() {
        this.flowers = new ArrayList<>();
    }

    public void zasaditKvetiny(Flower flower) {
        flowers.add(flower);

    }

}
