 class OverloadingTest {

        void cat() {
            System.out.println("매개변수 없음");
        }

        //매개변수 int형이 2개인 cat매서드
        void cat(int a, int b) {
            System.out.println("매개변수 : " + a + "," + b);
        }

        //매개변수 String 형이 한 개인 cat 메서드
        void cat(String c) {
            System.out.println("매개변수 :" + c);
        }
    }


class OverTest{
     public static void main(String[] args) {
         //Overloading Test 객체생성
         OverloadingTest ot = new OverloadingTest();

         //매개변수가 없는 cat()호출
         ot.cat();

         //매개변수가 int형 두개인 cat()호출
         ot.cat(20,80);

         //매개변수가 String 한개인 cat()호출
         ot.cat("오버로딩 예제입니다");
     }

}





