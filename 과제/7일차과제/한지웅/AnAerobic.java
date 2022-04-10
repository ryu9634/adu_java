public class AnAerobic extends Health{
    private double weight;
    AnAerobic(){

    }

    public AnAerobic(int part, String name, int times, int cycle, double weight) {
        super(part, name, times, cycle);
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
        return super.toString()  +
                " 무게=" + weight + "kg}";
    }
}


