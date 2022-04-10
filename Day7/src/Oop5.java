public class Oop5 {
    public static void main(String[] args) {
        Product product1 = new Product();
        System.out.println(product1);

        Product product2 = new Product(1, "맥북에어", 1500000, "애플", "2021-11-12");
        System.out.println(product2);

        Computer computer1 = new Computer();
        System.out.println(computer1);
        computer1.print();
        computer1.etc();

        Computer computer2 = new Computer(2, "삼성노트북", 1200000, "삼성", "2021-11-12", "윈도우10", "i7");
        System.out.println(computer2);

    }
}
