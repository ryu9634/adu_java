public class HotDog extends Dog {
    public void sleep(){   //생성자 오버로딩
        System.out.println(this.name+"zzzz");
    }
    public void sleep(int hour){ //생성자 오버로딩
        System.out.println(this.name+"zzzzzz"+hour+"hours");
    }


    public static void main(String[] args) {
        HotDog hotDog =new HotDog();
        hotDog.setName("sam");
        hotDog.sleep();
        hotDog.sleep(3);
    }
}
