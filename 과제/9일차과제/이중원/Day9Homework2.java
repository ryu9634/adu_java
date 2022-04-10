/*
    학생 관리 프로그램을 만들어보자.

    결과)
    메뉴를 선택하세요.
    1. 입력 2. 출력 3. 검색 4. 삭제 5. 수정 6. 종료

    1
    학번을 입력하세요
    반을 입력하세요
    이름을 입력하세요
    나이를 입력하세요
    연락처를 입력하세요

    2
    학번 : 10000
    반 : 1반
    이름 : 김사과
    나이 : 20
    연락처 : 010-1111-1111

    3
    검색할 학생의 학번을 입력하세요
    10000
    학번 : 10000
    반 : 1반
    이름 : 김사과
    나이 : 20
    연락처 : 010-1111-1111
    ✔ 만약 찾지 못했을 경우 -> "찾는 학생의 정보가 없음"

    4
    삭제할 학생의 학번을 입력하세요
    10000
    삭제되었습니다.

    5
    수정할 학생의 학생의 학번을 입력하세요
    10000
    반을 입력하세요
    이름을 입력하세요
    나이를 입력하세요
    연락처를 입력하세요
    수정되었습니다

    6
    프로그램 종료료
*/

import java.util.ArrayList;
import java.util.Scanner;

class Student{
    private int studentID;
    private int classNum;
    private String name;
    private int age;
    private String tel;

    public Student(int studentID, int classNum, String name, int age, String tel) {
        this.studentID = studentID;
        this.classNum = classNum;
        this.name = name;
        this.age = age;
        this.tel = tel;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getClassNum() {
        return classNum;
    }

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "*학번 :" + studentID +
                "\n*반 :" + classNum + "반" +
                "\n*이름 : " + name +
                "\n*나이 : " + age +
                "\n*연락처 : " + tel;
    }
}

public class Day9Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[학생관리프로그램]");

        String name, tel;
        int studentID, classNum, age;

        ArrayList<Student> list = new ArrayList<>();
        Student student;

        loop:
        while (true){
            System.out.println("🎁메뉴를 선택하세요.🎁\n1. 입력 2. 출력 3. 검색 4. 삭제 5. 수정 6. 종료");
            int menu = sc.nextInt();

            switch (menu){
                case 1: // input
                    System.out.print("학번 : ");
                    studentID = sc.nextInt();
                    System.out.print("학년 : ");
                    classNum = sc.nextInt();
                    System.out.print("이름 : ");
                    name = sc.next();
                    System.out.print("나이 : ");
                    age = sc.nextInt();
                    System.out.print("연락처 : ");
                    tel = sc.next();
                    student = new Student(studentID, classNum, name, age, tel);
                    list.add(student);
                    break;
                case 2: // output
                    System.out.println("=========================");
                    for (Student value : list) {
                        System.out.println(value);
                        System.out.println("=========================");
                    }
                    if(list.size() == 0){
                        System.out.println("*저장된 학생 정보가 없음");
                        System.out.println("=========================");
                    }
                    break;
                case 3: // search
                    System.out.print("✔찾을 학생의 학번 : ");
                    int find = sc.nextInt();
                    boolean isFind = false;
                    System.out.println("=========================");
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getStudentID() == find) {
                            System.out.println(list.get(i));
                            isFind = true;
                            System.out.println("=========================");
                        }
                    }
                    if(!isFind){
                        System.out.println("찾는 학생이 없음");
                        System.out.println("=========================");
                    }
                    break;
                case 4: // remove
                    System.out.println("✔삭제할 학생의 학번 : ");
                    int remove = sc.nextInt();
                    boolean isRemove = false;
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getStudentID() == remove) {
                            list.remove(i);
                            System.out.println("*삭제되었습니다.");
                            System.out.println("=========================");
                            isRemove = true;
                        }
                    }
                    if(!isRemove){
                        System.out.println("삭제할 학생 정보가 없음");
                        System.out.println("=========================");
                    }
                    break;
                case 5: // change
                    System.out.println("✔수정할 학생의 학번");
                    int change = sc.nextInt();
                    boolean isChange = false;
                    for(int i = 0; i < list.size(); i++){
                        if(list.get(i).getStudentID() == change){
                            System.out.print("학년 : ");
                            list.get(i).setClassNum(sc.nextInt());
                            System.out.print("이름 : ");
                            list.get(i).setName(sc.next());
                            System.out.print("나이 : ");
                            list.get(i).setAge(sc.nextInt());
                            System.out.print("연락처 : ");
                            list.get(i).setTel(sc.next());
                            System.out.println("수정 완료");
                            System.out.println("=========================");
                            isChange = true;
                        }
                    }
                    if(!isChange){
                        System.out.println("수정할 학생정보가 없음");
                        System.out.println("=========================");
                    }
                    break;
                case 6:
                    break loop;
            }
        }
    }
}
