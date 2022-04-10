//생성자
class Calculator {

    private int x1 = 0;
    private int y1 = 0;

    public Calculator(int x1, int y1){
        this.x1 = x1;
        this.y1 = y1;
    }
    public static void main(String[] args){
        Calculator cal = new Calculator(10, 20);

        System.out.println("x1 : " + cal.x1);
        System.out.println("y1 : " + cal.y1);

}


public class Homework_Day07_4 {

    }
}
