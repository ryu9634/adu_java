public class homeWork_3 {
    public static void main(String[] args) {


        //오버로드를 사용하여 homeWork_1 의 값을 불러냈다.
        homeWork_1 hw1 = new homeWork_1("류상표", 27, "남자", "서울");
        //오버로드를 사용하여 homeWork_2 의 값을 불러냈다.
        homeWork_2 hw2 = new homeWork_2("김승표", 12, "여자", "강원도");

        System.out.println(hw1.toString());
        hw1.print();  //homeWork_1 의 print() 메소드를 사용하였다.
        System.out.println();
        System.out.println(hw2.toString());
        hw2.print();  //homeWork_1의 print() 메소드를 오버라이딩하여 print() 메소드를 변형하였다.



    }

}
