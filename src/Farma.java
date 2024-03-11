import java.util.ArrayList;

public class Farma {
    private ArrayList<Flower> flowers;
    private double areaUsed;
    private static final int MAX_ROSTLINY = 5;
    private static final double MAX_POZEMEK = 100.0;
    private static final int MAX_ANIMAL = 20;
    private static final int MAX_VELKE_ZVIRATA = 10;
    private static final int MAX_SMALL_ANIMAL = 10;
    private ArrayList<Animal> animals;
    private int bigAnimalCount;
    private int smallAnimalCount;


    public Farma() {
        this.flowers = new ArrayList<>();
        this.areaUsed = 0.0;
        this.animals = new ArrayList<>();
        this.bigAnimalCount = 0;
        this.smallAnimalCount = 0;
    }

    public void plantFlower(Flower flower) {
        flowers.add(flower);
    }

    public void waterFlower() {
        for (Flower flower : flowers) {
            if (flower.needWater) {
                System.out.println("Watering " + flower.name + ".");
                flower.setWatered(true);
                double newGrothChance = flower.getChanceOfGrowth() + 0.1;
                flower.setChanceOfGrowth(newGrothChance);
            } else {
                System.out.println(flower.name + " no need to water anymore");
            }
        }
    }


    public void harvestFlowers(Flower flower) {
        if (flowers.size() < MAX_ROSTLINY && (areaUsed + flower.neededArea) <= MAX_POZEMEK) {
            flowers.add(flower);
            areaUsed += flower.neededArea;
            System.out.println(flower.getName() + "Planted");
        } else {
            System.out.println("Can not be planted");

        }
    }
    public void placeAnimal(Animal animals) {
        if (this.animals.size() < MAX_ANIMAL) {
            if (animals.getSize() == Size.BIG && bigAnimalCount < MAX_VELKE_ZVIRATA) {
                this.animals.add(animals);
                bigAnimalCount++;
                System.out.println("Animal " + animals.getName() + " has been placed");
            } else if (animals.getSize() == Size.SMALL && smallAnimalCount < MAX_SMALL_ANIMAL) {
                this.animals.add(animals);
                smallAnimalCount++;
                System.out.println("Animal " + animals.getName() + " has been placed");
            } else {
                System.out.println("Hay is full of this type of animal");
            }
        } else {
            System.out.println("Hay is already full");
        }
    }
}






