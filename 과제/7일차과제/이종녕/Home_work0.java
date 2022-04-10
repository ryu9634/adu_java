public class Home_work0 {
    public static void main(String[] args) {

        Coffee coffee = new Coffee();
        System.out.println(coffee);

        Americano americano = new Americano();
        System.out.println(americano);




        System.out.println();




        Coffee americano2 = new Coffee("콜드브루", 6000 , "집안", "검은색");
        System.out.println(americano2);

        Americano americano3 = new Americano("아메리카노" , 5000 , " 브라질" , "짙은갈색", "떫음" , "신맛");
        System.out.println(americano3);


        coffee.print();
        americano.print();   //오버 라이딩하여 부모클래스의 메소드 출력값을 재정의 했다


        americano.info1();
        americano.info1("이종녕");

        coffee.info("종녕");
        coffee.info(26);      //부모 클래스에서의 오버 로딩



    }

}
