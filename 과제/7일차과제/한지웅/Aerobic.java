public class Aerobic extends Health{
    private int km;
    Aerobic(){
    }

    public Aerobic(int part, String name, int times, int cycle, int km) {
        super(part, name, times, cycle);
        this.km = km;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return super.toString() +
                " 거리=" + km + "km}";
    }
}
