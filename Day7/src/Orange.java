public class Orange extends Fruit {
    private double weight;

    public Orange(String name, int price, String color, String from, double weight) {
        super(name, price, color, from);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "중량=" + weight +
                '}';
    }
}
