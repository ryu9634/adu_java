public class Banana extends Fruit{
    private int count;

    public Banana(String name, int price, String color, String from, int count) {
        super(name, price, color, from);
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "개수=" + count +
                '}';
    }
}
