public class Super {
    String name;  //필드
    int price;

   public  Super(String name, int price){ //부모의 생성자가 있는경우
       this.name=name;
       this.price=price;
   }
    public void print(){
        System.out.println("책 이름과 가격: "+name+" "+price);
    }

    public static class ChildBook extends Super{
       ChildBook(){
           super("나의 라임오렌지 나무",100000);
       }
    }

    public static void main(String[] args) {
      ChildBook Child =new ChildBook();
        System.out.println("[구현 결과 2] :");
        Child.print();

    }
}
