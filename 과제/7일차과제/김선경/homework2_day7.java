public class homework2_day7 {

    public static void main(String[] args) {

    // super 키워드 test
        Child super1=new Child();
        System.out.println(super1.toString());

    // 만들어 둔 child 생성자 호출
        Child super2= new Child("생성자 호출", 1, "일반 생성자");
        System.out.println(super2.toString());

        //오버로딩 생성자 호출
        Child super3=new Child("오버로딩 생성자 호출");
        System.out.println(super3.toString());

    }

}
