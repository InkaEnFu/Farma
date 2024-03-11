import java.util.ArrayList;

public class Farmar {
    private ArrayList<Flower> flowers;

    public Farmar() {
        this.flowers = new ArrayList<>();
    }

    public void plantFlower(Flower flower) {
        flowers.add(flower);
    }
    public void waterFlower() {
        for (Flower flower : flowers) {
            if (flower.needWater) {
                System.out.println("Watering " + flower.name + ".");
                flower.setWatered(true);
            } else {
                System.out.println(flower.name + " no need to water anymore");
            }
        }
    }
    public void harvestFlowers() {
        for (Flower flower : flowers) {
        }
    }
}




