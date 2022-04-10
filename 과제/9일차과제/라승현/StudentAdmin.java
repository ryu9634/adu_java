/*
😒 과제 : 학생 관리 프로그램 만들기

            메뉴를 선택하세요
            1. 입력 2. 출력 3. 검색 4. 삭제 5. 수정 6. 종료
            입력 선택시 학번, 반, 이름, 나이, 연락처 저장
            출력 선택시 입력된 데이터 출력
            검색 선택시 검색할 학생의 학번 입력하여 toString 출력
            　- false의 경우 " 찾는 학생의 정보가 없습니다. "
            삭제 선택시 삭제할 학생 학번 입력시 삭제 후 "삭제되었습니다 !"
            수정 선택시 수정할 학생 학번 선택하면 1번으로 돌아감
 */

import java.util.ArrayList;
import java.util.Scanner;

public class StudentAdmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[학생 관리 프로그램]");
        System.out.println("아래의 메뉴를 선택하세요.");

        String name;
        int stuNum, claNum, age, phoneNum;
        AdminOrd ord;
        AdminOrd refresh;

        ArrayList<AdminOrd> arrList = new ArrayList<>();

        while (true) {
            System.out.println("1. 입력 2. 출력 3. 검색 4. 삭제 5. 수정 6. 종료");
            int num = sc.nextInt();

            if (num == 6) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            switch (num) {
                case 1:                                     // 입력
                    System.out.println("학생의 정보를 순서대로 입력해주세요.");
                    System.out.print("학번 : ");
                    stuNum = sc.nextInt();
                    System.out.print("반 : ");
                    claNum = sc.nextInt();
                    System.out.print("이름 : ");
                    name = sc.next();
                    System.out.print("나이 : ");
                    age = sc.nextInt();
                    System.out.print("연락처 : ");
                    phoneNum = sc.nextInt();
                    System.out.println(name + " 학생의 정보를 저장했습니다.");

                    ord = new AdminOrd(stuNum, claNum, name, age, phoneNum);
                    arrList.add(ord);
                    break;
                case 2:                                     // 출력
                    if(arrList.size() == 0){
                        System.out.println("입력된 정보가 없습니다.");
                        break;
                    }
                    System.out.println("입력하신 학생 정보 입니다.");
                    for (int i = 0; i < arrList.size(); i++) {
                        System.out.println(arrList.get(i));
                    }
                    break;
                case 3:                                     // 검색
                    if(arrList.size() == 0){
                        System.out.println("입력된 정보가 없습니다.");
                        break;
                    }
                    System.out.println("검색할 학생의 학번을 입력하세요.");
                    System.out.print("학번 : ");
                    num = sc.nextInt();
                    boolean isFind = false;
                    for (int i = 0; i < arrList.size(); i++) {
                        if (num == arrList.get(i).getStunum()) {
                            System.out.println("입력하신 학번 " + arrList.get(i).getStunum() + "의 정보를 찾았습니다.");
                            System.out.println(arrList.get(i));
                            isFind = true;
                        }
                    }
                    if (!isFind) System.out.println("검색하신 학생의 정보가 없습니다.");
                    break;
                case 4:                                     // 삭제
                    if(arrList.size() == 0){
                        System.out.println("입력된 정보가 없습니다.");
                        break;
                    }
                    System.out.println("삭제할 학생의 학번을 입력하세요.");
                    System.out.print("학번 : ");
                    num = sc.nextInt();
                    isFind = false;
                    for (int i = 0; i < arrList.size(); i++) {
                        if (num == arrList.get(i).getStunum()) {
                            System.out.println("입력하신 학번 " + arrList.get(i).getStunum() + "의 정보를 삭제했습니다.");
                            arrList.remove(i);
                            isFind = true;
                        }
                    }
                    if (!isFind) System.out.println("요청하신 학생의 정보가 없습니다.");
                    break;
                case 5:                                     // 수정
                    if(arrList.size() == 0){
                        System.out.println("입력된 정보가 없습니다.");
                        break;
                    }
                    System.out.println("수정할 학생의 학번을 입력하세요.");
                    System.out.print("학번 : ");
                    num = sc.nextInt();
                    isFind = false;
                    for (int i = 0; i < arrList.size(); i++) {
                        if (num == arrList.get(i).getStunum()) {
                            System.out.println("수정하실 학번 " + arrList.get(i).getStunum() + "의 정보를 입력하세요.");
                            System.out.print("학번 : ");
                            stuNum = sc.nextInt();
                            System.out.print("반 : ");
                            claNum = sc.nextInt();
                            System.out.print("이름 : ");
                            name = sc.next();
                            System.out.print("나이 : ");
                            age = sc.nextInt();
                            System.out.print("연락처 : ");
                            phoneNum = sc.nextInt();
                            System.out.println(name + " 학생의 정보를 수정했습니다.");

                            ord = new AdminOrd(stuNum, claNum, name, age, phoneNum);
                            arrList.set(i, ord);
                            isFind = true;
                        }
                    }
                    if (!isFind) System.out.println("수정할 학생의 정보가 없습니다.");
                    break;
            }
        }
    }
}