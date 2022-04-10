public class Oop4 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setNo(1);
        student.setName("김사과");
        // System.out.println(student.toString());
        System.out.println(student);

        Student[] students = new Student[3];
        students[0] = new Student();    // 반드시 객체를 생성해야 함 !!!!!!!!
        students[0].setNo(2);
        students[0].setName("반하나");
        System.out.println(students[0]);

        students[1] = new Student();
        students[1].setNo(3);
        students[1].setName("오렌지");
        System.out.println(students[1]);

        students[2] = new Student();
        students[2].setNo(4);
        students[2].setName("이메론");
        System.out.println(students[2]);
        System.out.println();

        for(Student student1 : students){
            System.out.println(student1);
        }
    }
}
