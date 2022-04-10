public class Health {
    private int strength;
    private  String name;
    private int times;
    private int cycle;

    public Health(){

    }

    public Health(int part, String name, int times, int cycle) {
        this.strength = part;
        this.name = name;
        this.times = times;
        this.cycle = cycle;
    }

    public int getPart() {
        return strength;
    }

    public void setPart(int part) {
        this.strength = part;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public int getCycle() {
        return cycle;
    }

    public void setCycle(int cycle) {
        this.cycle = cycle;
    }

    @Override
    public String toString() {
        return "운동{" +
                "강도=" + strength +
                ", 명칭=" + name + '\'' +
                ", 횟수=" + times +
                ", 주기=" + cycle + ",";
    }
}
