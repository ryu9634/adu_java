import java.util.Scanner;

/*
과제.
아래 용어에 대해 조사하고 예제를 만들어보자!
- 상속 : 자식(클래스)이 상속받고 싶은 부모(클래스)를 선택해서 물려받는다.
        이때 상속받는 클래스를 자식 클래스, 하위 클래스 또는 서브 클래스라고 부른다. 상속을 해주는 클래스를 부모 클래스, 상위 클래스 또는 슈퍼 클래스라고 한다.
- 접근제어자 : public, private, protected, default 가 있으며, 각각쓰임새가 다르다.
- super 키워드 : 부모 클래스로부터 상속받은 필드나 메소드를 자식 클래스에서 참조하는 데 사용하는 참조 변수
- this 키워드 : 자기 자신을 가리키는 키워드로 필드와 메소드 또는 생성자의 매개변수가 동일할 때, 인스턴스 멤버인 필드임을 명확히 하기 위해 사용한다.
- 생성자 : new 키워드를 사용하여 객체가 생성될 때 자동으로 실행되는 특수한 형태의 메소드.
          생성자도 메서드의 한 종류이므로 파라미터를 함께 정의하는 것이 가능하다.
          생성자의 파라미터를 멤버변수에 할당하는 것으로 객체의 초기화를 외부적인 요인에 의해 처리할 수 있다.
- 오버로딩 : 이름이 같은 메소드라 할지라도, 매개변수의 이름 또는 타입을 다르게 설정하면 같은 이름의 메소드를 선언할 수 있다.
- 오버라이딩 : 부모 필드에서 선언한 메소드를 자식 필드에서 수정하고자 할 때 재정의를 해야 한다.
	          이는 자식에서 부모 필드의 메소드와 동일한 이름으로 선언하는 것이다.
	          부모 필드가 메모리에 먼저 할당되고 a라는 메소드가 먼저 올라간다고 하면,
	          자식 필드가 메모리에 할당되면서 재정의한 a 메소드가 새롭게 만들어지는 것이 아닌
	          기존에 할당된 a 메소드 저장공간에 새롭게 재정의한 소스코드의 주소가 들어가게 된다.
	          따라서 자식 객체로 a 메소드에 접근하면 자식 필드에서 재정의한 소스코드의 내용이 읽히게 된다.
 */
class Zoo{
    private String sound;
    private String color;
    private int leg_num;

    public Zoo(String sound, String color, int leg_num) {
        this.sound = sound;
        this.color = color;
        this.leg_num = leg_num;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLeg_num() {
        return leg_num;
    }

    public void setLeg_num(int leg_num) {
        this.leg_num = leg_num;
    }
}

class Lion extends Zoo{
    private String area;
    private int hunger = 0;
    private int playing = 0;

    public Lion(String sound, String color, int leg_num, String area) {
        super(sound, color, leg_num);
        this.area = area;
    }

    public int getPlaying() {
        return playing;
    }

    public void setPlaying(int playing) {
        this.playing = playing;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void play(){
        System.out.println(" ");
        System.out.println("사자와 함께할 행동을 선택하세요.(1.산책 2.사냥연습 3.혼내기)");
        if(playing > 100){
            playing = 100;
        }
        System.out.println("현재 행복 수치 : " + playing);
        Scanner sc = new Scanner(System.in);
        int play_count = 0;
        play_count = sc.nextInt();
        if(playing <=100){
            if(play_count == 1){
                playing = playing + 20;
                System.out.println("산책을 한 후 기분이 20만큼 좋아졌습니다.");
                System.out.println("");
            } else if(play_count == 2){
                playing = playing + 5;
                System.out.println("사냥연습을 한 후 기분이 5만큼 좋아졌습습니다.");
            } else if(play_count == 3){
                playing = playing - 3;
                System.out.println("사자가 울부짖습니다. 기분이 3만큼 감소하였습니다.");
            }
        } else if(playing > 100){
            System.out.println("사자가 짜증을 냅니다. (피곤합니다.)");
        }
    }
    public void feed(){
        System.out.println(" ");
        System.out.println("사자에게 줄 먹이를 선택하세요.(1.고기 2.과일 3.쓰레기)");
        if(hunger > 100){
            hunger = 100;
        }
        System.out.println("현재 배고픔 수치 : " + hunger);
        Scanner sc = new Scanner(System.in);
        int feed_count = 0;
        feed_count = sc.nextInt();
        if(hunger <=100){
            if(feed_count == 1){
                hunger = hunger + 20;
                System.out.println("고기를 먹고 배고픔 수치가 20만큼 증가하였습니다.");
                System.out.println("");
            } else if(feed_count == 2){
                hunger = hunger + 5;
                System.out.println("과일을 먹고 배고픔 수치가 5만큼 증가하였습니다.");
            } else if(feed_count == 3){
                hunger = hunger - 3;
                System.out.println("사자가 화를 냅니다. 배고픔 수치가 3만큼 감소하였습니다.");
            }
        } else if(hunger > 100){
            System.out.println("사자가 짜증을 냅니다. (배가 너무 부릅니다.)");
        }
    }
}

class Tiger extends Zoo{
    private String area;

    public Tiger(String sound, String color, int leg_num, String area) {
        super(sound, color, leg_num);
        this.area = area;
    }
}

class Dog extends Zoo{
    public Dog(String sound, String color, int leg_num) {
        super(sound, color, leg_num);
    }
}

public class Homework1_animalonline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lion lion = new Lion("으르렁","노란색", 4, "특별 관리 구역");
        Tiger tiger = new Tiger("어흥","줄무늬노랑색", 4, "특별관리구역");
        Dog dog = new Dog("왈왈","흰색백구",4);

        System.out.println("🐱🐱🐱🐱🐱🐱동물 키우기 온라인🐱‍🐱🐱🐱🐱🐱");
        System.out.println("키우고 싶은 동물을 선택하세요.(1. 사자, 2. 호랑이, 3. 개)");
        int index_num = sc.nextInt();
        if(index_num == 1) {
            System.out.println(" ");
            System.out.println("사자를 선택하셨습니다.");
            System.out.println(" ");

            while (true) {
                System.out.println("메뉴를 선택하세요(1.먹이 주기 2.놀아 주기 3.놓아 주기)");
                int menu_num = sc.nextInt();
                while (menu_num == 1) {
                    lion.feed();
                    if(lion.getHunger() >= 80 ) {
                        System.out.println("사자가 너무 배부릅니다.");
                        System.out.println(" ");
                        break;
                    }
                }
                while (menu_num == 2) {
                    lion.play();
                    if(lion.getPlaying() >= 80) {
                        System.out.println("사자가 피곤합니다.");
                        System.out.println(" ");
                        break;
                    }
                }
                if (menu_num == 3) {
                    System.out.println("사자에게 잡아 먹혔습니다.");
                    break;
                }
            }
        }
    if(index_num == 2){
        System.out.println("준비 중 입니다. 조금만 기다려주세요!");
    }
    if(index_num == 3){
        System.out.println("준비 중 입니다. 조금만 기다려주세요!");
    }
    }
}
