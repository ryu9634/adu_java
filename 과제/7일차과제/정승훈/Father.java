public class Father extends Family{     // Father 클래스는 Family 클래스로부터 메소드와 필드를 물려받아 사용
    String com;
    public Father(){

    }


    public Father(int no, String name, int age, String from, String com) {
        super(no, name, age, from);
        this.com = com;
    }

    public String getCom() {return com;}
    public void setCom(String com) {this.com = com;}

    @Override
    public String toString() {
        return super.toString() + "Father{" +
                "com='" + com + '\'' +
                '}';
    }
}

