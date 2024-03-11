public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;
    protected boolean needWater;
    protected boolean watered;

    public Flower(String name, double price, double neededArea, double chanceOfGrowth, boolean potrebujesZavlazit, boolean watered) {
        this.name = name;
        this.price = price;
        this.neededArea = neededArea;
        this.chanceOfGrowth = chanceOfGrowth;
        this.needWater = potrebujesZavlazit;
        this.watered = watered;
    }

    public void setNeedWater(boolean needWater) {
        this.needWater = needWater;
    }

    public void setWatered(boolean watered) {
        this.watered = watered;
    }

    public String getName() {
        return name;
    }

    public double getChanceOfGrowth() {
        return chanceOfGrowth;
    }

    public void setChanceOfGrowth(double chanceOfGrowth) {
        this.chanceOfGrowth = chanceOfGrowth;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                ", needWater=" + needWater +
                ", watered=" + watered +
                '}';
    }
}
