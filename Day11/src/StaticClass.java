public class StaticClass {
    static class Static {
        int num = 0;
        public void plus(){
            num++;
        }
    }

    public static void main(String[] args) {
        StaticClass.Static Static = new StaticClass.Static();
        Static.plus();
        System.out.println(Static.num);
    }
}
