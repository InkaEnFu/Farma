import java.util.ArrayList;

public class Farmar {
    private ArrayList<Flower> flowers;
    private double obsazenyPozemek;
    private static final int MAX_ROSTLINY = 5;
    private static final double MAX_POZEMEK = 100.0;


    public Farmar() {
        this.flowers = new ArrayList<>();
        this.obsazenyPozemek = 0.0;
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

    public void harvestFlowers(Flower flower) {
        if (flowers.size() < MAX_ROSTLINY && (obsazenyPozemek + flower.neededArea) <= MAX_POZEMEK) {
            flowers.add(flower);
            obsazenyPozemek += flower.neededArea;
            System.out.println(flower.getName() + "Planted");
        } else {
            System.out.println("Nelze zasadit");

        }
    }
}





