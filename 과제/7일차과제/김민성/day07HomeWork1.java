
// 상속 예제
public class day07HomeWork1 {
    // car 부모클래스
    protected void printCarName() {
        System.out.println("차명은 Car입니다.");
    }

    protected static void printCarType() {
        System.out.println("차종은 CarType입니다.");
    }

    // 자식 클래스
    public class BMW extends Car {

        public void printCarName() {
            System.out.println("차명은 BMW");
        }

        public static void printCarType() {
            System.out.println("차좋은 세단입니다.");
        }

    }

    public static void main(String[] args) {

        car child = new BMW();
        child.printCarName();
        car.printCarType():
        BMW.printCarType();
    }
}

// 2.접근제어자 예제
public class access {
    public static void main(String[] args) {

        A a = new A();

        System.out.println(a.one);
        System.out.println(a.getOne());
    }
}

class A {
    private String one;

    public String getOne() {
        one = "one";
        return one;
    }
}

public class one {
    protected String one;

    protected String getOne() {
        one = "one";
        return one;
    }

    public class Main {
        public static void main(String[] args) {
            one a = new One();

            System.out.println(a.one);
            System.out.println(a.getOne());
        }
    }

    // 3.super 키워드
    class Parent {
        int a = 10;
    }


    class Child extends Parent {

        void display() {

            System.out.println(a);

            System.out.println(this.a);

            System.out.println(super.a);

        }

    }


    public class Inheritance02 {

        public static void main(String[] args) {

            Child ch = new Child();

            ch.display();

        }

    }

    // 4.this 키워드
    class Car {

        private String modelName;

        private int modelYear;

        private String color;

        private int maxSpeed;

        private int currentSpeed;


        Car(String modelName, int modelYear, String color, int maxSpeed) {

            this.modelName = modelName;

            this.modelYear = modelYear;

            this.color = color;

            this.maxSpeed = maxSpeed;

            this.currentSpeed = 0;

        }


    }
    // 5.생성자

    Car(String modelName) {
    }

    Car(String modelName, int modelYear) {
    }

    Car(String modelName, int modelYear, String color) {
    }

    Car(String modelName, int modelYear, String color, int maxSpeeds) {
    }

    car(String modelName, int modelYear, String color, int maxSpeeds) {

        this.modelName = modelName;

        this.modelYear = modelYear;

        this.color = color;

        this.maxSpeed = maxSpeed;

        this.currentSpeed = 0;

    }

    class Car {

        private String modelName;

        private int modelYear;

        private String color;

        private int maxSpeed;

        private int currentSpeed;


        Car(String modelName, int modelYear, String color, int maxSpeed) {

            this.modelName = modelName;

            this.modelYear = modelYear;

            this.color = color;

            this.maxSpeed = maxSpeed;

            this.currentSpeed = 0;

        }


        public String getModel() {

            return this.modelYear + "년식 " + this.modelName + " " + this.color;

        }

    }


    public class Method02 {

        public static void main(String[] args) {

            Car myCar = new Car("아반떼", 2016, "흰색", 200);


        }
        // 6.오버로딩

        class MyMath {

            int first, second, third;

            public void a(int first, int second) {
                System.out.println("a(int first, int second)");
                this.first = first;
                this.second = second;
            }

            public void a(int first, int second, int third) {
                System.out.println("a(int first, int second, int third)");
                this.first = first;
                this.second = second;
                this.third = third;
            }

            public void sum() {
                System.out.println(this.first + this.second + this.third);
            }
        }


        class exercise {
            public static void main(String[] args) {

                MyMath mission = new MyMath();

                mission.a(1, 2);
                mission.sum();
                mission.a(1, 2, 3);
                mission.sum();


            }

            // 7.오버라이딩
            public class Book {

                public String name;
                public int price;

                public void print() {
                    System.out.println("책 이름 " + this.name + ", 가격은" + this.price);
                }
            }

            public class Bookstore extends Book {

                String publisher; // 출판사

                public void print() {
                    System.out.println("책 이름은 " + this.name + " 가격은" + this.price + "출판사는 " + this.publisher);
                }
            }



        }
































