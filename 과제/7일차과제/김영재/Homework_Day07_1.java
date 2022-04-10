//캐릭터의 기본값
class Character{
    public int hp ;
    public int mp ;
    public int height ;
    public int age ;

    public Character(int hp, int mp, int height, int age) {
        this.hp = hp;
        this.mp = mp;
        this.height = height;
        this.age = age;
    }
}

//유저의 캐릭터 기본값 상속
class User1 extends Character {
    public String name ;

    public User1(int hp, int mp, int height, int age, String name) {
        super(hp, mp, height, age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "캐릭터 이름: " + name +
                "이(가) 생성되었습니다." +"\n" +"HP: "+hp+" MP: "+mp+" HEIGHT: "+height+" AGE: "+age;
    }
}


public class Homework_Day07_1 {
    //상속 예제
    public static void main(String[] args) {
       User1 us = new User1(150,20,30,40,"홍길동");
        System.out.println(us);
    }
}
